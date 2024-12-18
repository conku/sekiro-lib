package com.virjar.sekiro;

import io.netty.util.AttributeKey;

public interface Constants {
    int READ_IDLE_TIME = 60*5;
    int WRITE_IDLE_TIME = 5;
    /**
     * max packet is 最大允许传输10M的数据.
     */
    int MAX_FRAME_LENGTH = 10 * 1024 * 1024;
    int LENGTH_FIELD_OFFSET = 0;
    int LENGTH_FIELD_LENGTH = 4;
    int INITIAL_BYTES_TO_STRIP = 0;
    int LENGTH_ADJUSTMENT = 0;

    int defaultNatServerPort = 6600;
    int defaultNatHttpServerPort = 6601;
    int defaultWebSocketServerPort = 6603;

    AttributeKey<String> CLIENT_KEY = AttributeKey.newInstance("client_Key");
    AttributeKey<String> GROUP_KEY = AttributeKey.newInstance("goup_Key");

    int protocolMagic = 5597;
}
