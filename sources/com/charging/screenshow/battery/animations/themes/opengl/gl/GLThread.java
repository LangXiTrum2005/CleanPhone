package com.charging.screenshow.battery.animations.themes.opengl.gl;

/* JADX INFO: loaded from: classes3.dex */
class GLThread extends Thread {
    public static final GLThreadManager X = new GLThreadManager();

    public static class GLThreadManager {
        public final synchronized void a(GLThread gLThread) {
            GLThreadManager gLThreadManager = GLThread.X;
            notifyAll();
        }
    }

    public final void b() {
        try {
            synchronized (X) {
                throw null;
            }
        } catch (Throwable th) {
            synchronized (X) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        GLThreadManager gLThreadManager = X;
        setName("GLThread " + getId());
        try {
            b();
            throw null;
        } catch (InterruptedException unused) {
            gLThreadManager.a(this);
        } catch (Throwable th) {
            gLThreadManager.a(this);
            throw th;
        }
    }
}
