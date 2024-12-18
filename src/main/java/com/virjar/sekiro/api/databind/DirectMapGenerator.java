package com.virjar.sekiro.api.databind;

import com.virjar.sekiro.api.SekiroRequest;
import com.virjar.sekiro.api.SekiroRequestHandler;
import com.virjar.sekiro.log.SekiroLogger;


/**
 * ActionRequestHandler 中没有其他额外的属性
 */
public class DirectMapGenerator implements ActionRequestHandlerGenerator {
    private SekiroRequestHandler delegate;

    public DirectMapGenerator(SekiroRequestHandler delegate) {
        SekiroLogger.info("DirectMapGenerator 初始化。ActionRequestHandler 中没有其他额外的属性");
        this.delegate = delegate;
    }

    @Override
    public SekiroRequestHandler gen(SekiroRequest invokeReques) {
        return delegate;
    }
}