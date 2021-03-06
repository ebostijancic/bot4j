/*
 * Copyright (C) 2017, nitro ventures GmbH
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package ai.nitro.bot4j.integration.facebook.send.rules.impl;

import javax.inject.Singleton;

import com.restfb.types.send.IdMessageRecipient;
import com.restfb.types.send.Message;

import ai.nitro.bot4j.integration.facebook.domain.FacebookPlatformEnum;
import ai.nitro.bot4j.middle.domain.send.SendMessage;

@Singleton
public class NativeRuleImpl extends AbstractFacebookSendRuleImpl {

	@Override
	public boolean applies(final SendMessage sendMessage) {
		final boolean result = sendMessage.getNativePayload(FacebookPlatformEnum.FACEBOOK) != null;
		return result;
	}

	@Override
	public void apply(final SendMessage sendMessage) {
		final Message message = (Message) sendMessage.getNativePayload(FacebookPlatformEnum.FACEBOOK);
		final IdMessageRecipient recipient = createIdMessageRecipient(sendMessage.getRecipient());
		publish(sendMessage, message, recipient);
	}
}
