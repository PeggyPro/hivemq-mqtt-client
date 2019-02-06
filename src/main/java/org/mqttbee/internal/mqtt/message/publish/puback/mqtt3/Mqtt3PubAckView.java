/*
 * Copyright 2018 The MQTT Bee project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.mqttbee.internal.mqtt.message.publish.puback.mqtt3;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.annotations.Immutable;
import org.mqttbee.internal.mqtt.datatypes.MqttUserPropertiesImpl;
import org.mqttbee.internal.mqtt.message.publish.puback.MqttPubAck;
import org.mqttbee.mqtt.mqtt3.message.publish.puback.Mqtt3PubAck;
import org.mqttbee.mqtt.mqtt5.message.publish.puback.Mqtt5PubAckReasonCode;

/**
 * @author Silvio Giebl
 */
@Immutable
public class Mqtt3PubAckView implements Mqtt3PubAck {

    public static final @NotNull Mqtt3PubAckView INSTANCE = new Mqtt3PubAckView();

    public static @NotNull MqttPubAck delegate(final int packetIdentifier) {
        return new MqttPubAck(packetIdentifier, Mqtt5PubAckReasonCode.SUCCESS, null,
                MqttUserPropertiesImpl.NO_USER_PROPERTIES);
    }

    private Mqtt3PubAckView() {}

    @Override
    public @NotNull String toString() {
        return "MqttPubAck{}";
    }
}
