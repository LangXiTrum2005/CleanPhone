package org.greenrobot.eventbus;

import com.p004ironsource.d9;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
public interface Logger {

    public static class Default {
    }

    public static class JavaLogger implements Logger {
        @Override // org.greenrobot.eventbus.Logger
        public final void a(Level level, String str, Throwable th) {
            throw null;
        }

        @Override // org.greenrobot.eventbus.Logger
        public final void b(Level level, String str) {
            throw null;
        }
    }

    public static class SystemOutLogger implements Logger {
        @Override // org.greenrobot.eventbus.Logger
        public final void a(Level level, String str, Throwable th) {
            System.out.println(d9.i.d + level + "] " + str);
            th.printStackTrace(System.out);
        }

        @Override // org.greenrobot.eventbus.Logger
        public final void b(Level level, String str) {
            System.out.println(d9.i.d + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th);

    void b(Level level, String str);
}
