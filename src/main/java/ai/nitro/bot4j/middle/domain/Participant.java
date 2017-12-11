/*
 * Copyright (C) 2017, nitro ventures GmbH
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package ai.nitro.bot4j.middle.domain;

import java.util.Locale;

public class Participant {

	protected String deviceId;

	protected String id;

	protected Locale locale;

	protected Platform platform;

	public String getDeviceId() {
		return deviceId;
	}

	public String getId() {
		return id;
	}

	public Locale getLocale() {
		return locale;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setDeviceId(final String deviceId) {
		this.deviceId = deviceId;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public void setLocale(final Locale locale) {
		this.locale = locale;
	}

	public void setPlatform(final Platform platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "id=[" + id + "], platform=[" + platform + "]";
	}
}
