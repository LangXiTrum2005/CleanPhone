package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2866e4 implements wireman {
    public final /* synthetic */ C2968i4 a;

    public C2866e4(C2968i4 c2968i4) {
        this.a = c2968i4;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        Config config = (Config) obj;
        this.a.a.b.put(config.getType(), config);
        C2968i4 c2968i4 = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c2968i4.a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                InterfaceC3216s4 interfaceC3216s4 = (InterfaceC3216s4) ((WeakReference) it.next()).get();
                if (interfaceC3216s4 != null) {
                    interfaceC3216s4.a(config);
                }
            }
        }
        c2968i4.a.c.remove(config.getType());
        return Unit.f29295attabal;
    }
}
