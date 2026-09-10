package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import ea.f4;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m4.a;
import m4.b;
import x0.g;
import x0.h;
import x0.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // m4.b
    public final Object create(Context context) {
        Object objB;
        m mVar = new m(new f4(context, 6));
        mVar.f4730a = 1;
        if (g.f53514k == null) {
            synchronized (g.f53513j) {
                try {
                    if (g.f53514k == null) {
                        g.f53514k = new g(mVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f45865e) {
            try {
                objB = aVarC.f45866a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        o lifecycle = ((v) objB).getLifecycle();
        lifecycle.a(new h(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // m4.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
