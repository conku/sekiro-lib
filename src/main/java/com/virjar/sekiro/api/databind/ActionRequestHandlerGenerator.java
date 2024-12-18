package com.virjar.sekiro.api.databind;


import com.virjar.sekiro.api.SekiroRequest;
import com.virjar.sekiro.api.SekiroRequestHandler;

/**
 * SekiroRequestHandler 生成器
 */
public interface ActionRequestHandlerGenerator {
    SekiroRequestHandler gen(SekiroRequest invokeRequest);
}
