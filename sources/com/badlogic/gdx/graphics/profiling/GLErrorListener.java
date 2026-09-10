package com.badlogic.gdx.graphics.profiling;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public interface GLErrorListener {
    public static final GLErrorListener LOGGING_LISTENER = new GLErrorListener() { // from class: com.badlogic.gdx.graphics.profiling.GLErrorListener.1
        @Override // com.badlogic.gdx.graphics.profiling.GLErrorListener
        public void onError(int i) {
            String methodName = null;
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i2 = 0; i2 < stackTrace.length; i2++) {
                    if ("check".equals(stackTrace[i2].getMethodName())) {
                        int i3 = i2 + 1;
                        if (i3 >= stackTrace.length) {
                            break;
                        }
                        methodName = stackTrace[i3].getMethodName();
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            if (methodName == null) {
                Gdx.app.error("GLProfiler", "Error " + GLInterceptor.resolveErrorNumber(i) + " at: ", new Exception());
                return;
            }
            Gdx.app.error("GLProfiler", "Error " + GLInterceptor.resolveErrorNumber(i) + " from " + methodName);
        }
    };
    public static final GLErrorListener THROWING_LISTENER = new GLErrorListener() { // from class: com.badlogic.gdx.graphics.profiling.GLErrorListener.2
        @Override // com.badlogic.gdx.graphics.profiling.GLErrorListener
        public void onError(int i) {
            throw new GdxRuntimeException("GLProfiler: Got GL error " + GLInterceptor.resolveErrorNumber(i));
        }
    };

    void onError(int i);
}
