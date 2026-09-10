package com.badlogic.gdx.graphics.profiling;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL32;
import com.badlogic.gdx.math.FloatCounter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public abstract class GLInterceptor implements GL20 {
    protected int calls;
    protected int drawCalls;
    protected GLProfiler glProfiler;
    protected int shaderSwitches;
    protected int textureBindings;
    protected final FloatCounter vertexCount = new FloatCounter(0);

    public GLInterceptor(GLProfiler gLProfiler) {
        this.glProfiler = gLProfiler;
    }

    public static String resolveErrorNumber(int i) {
        switch (i) {
            case GL20.GL_INVALID_ENUM /* 1280 */:
                return "GL_INVALID_ENUM";
            case GL20.GL_INVALID_VALUE /* 1281 */:
                return "GL_INVALID_VALUE";
            case GL20.GL_INVALID_OPERATION /* 1282 */:
                return "GL_INVALID_OPERATION";
            case GL32.GL_STACK_OVERFLOW /* 1283 */:
            case GL32.GL_STACK_UNDERFLOW /* 1284 */:
            default:
                return AbstractC3950lJ.p("number ", i);
            case GL20.GL_OUT_OF_MEMORY /* 1285 */:
                return "GL_OUT_OF_MEMORY";
            case GL20.GL_INVALID_FRAMEBUFFER_OPERATION /* 1286 */:
                return "GL_INVALID_FRAMEBUFFER_OPERATION";
        }
    }

    public int getCalls() {
        return this.calls;
    }

    public int getDrawCalls() {
        return this.drawCalls;
    }

    public int getShaderSwitches() {
        return this.shaderSwitches;
    }

    public int getTextureBindings() {
        return this.textureBindings;
    }

    public FloatCounter getVertexCount() {
        return this.vertexCount;
    }

    public void reset() {
        this.calls = 0;
        this.textureBindings = 0;
        this.drawCalls = 0;
        this.shaderSwitches = 0;
        this.vertexCount.reset();
    }
}
