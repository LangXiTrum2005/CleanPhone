package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3180qh {
    public final attabal a = beachfront.saneness(false, 1, null);
    public WeakReference b = new WeakReference(null);
    public int c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C3130oh c3130oh;
        CoroutineContext coroutineContext;
        if (continuationImpl instanceof C3130oh) {
            c3130oh = (C3130oh) continuationImpl;
            int i = c3130oh.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3130oh.d = i - Integer.MIN_VALUE;
            } else {
                c3130oh = new C3130oh(this, continuationImpl);
            }
        } else {
            c3130oh = new C3130oh(this, continuationImpl);
        }
        Object obj = c3130oh.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3130oh.d;
        if (i2 == 0) {
            dern.saneness(obj);
            CoroutineContext context = c3130oh.getContext();
            c3130oh.getContext();
            System.out.getClass();
            if (Intrinsics.wireman(this.b.get(), context)) {
                this.c++;
                return Unit.f29295attabal;
            }
            attabal attabalVar = this.a;
            c3130oh.a = context;
            c3130oh.d = 1;
            if (attabal.C0613attabal.attabal(attabalVar, null, c3130oh, 1, null) == objBeachfront) {
                return objBeachfront;
            }
            coroutineContext = context;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineContext = c3130oh.a;
            dern.saneness(obj);
        }
        this.b = new WeakReference(coroutineContext);
        this.c = 1;
        return Unit.f29295attabal;
    }

    public final Unit a(C3155ph c3155ph) {
        CoroutineContext context = c3155ph.getContext();
        c3155ph.getContext();
        System.out.getClass();
        if (Intrinsics.wireman(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new WeakReference(null);
                attabal.C0613attabal.dern(this.a, null, 1, null);
            }
            return Unit.f29295attabal;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(E3 e3, ContinuationImpl continuationImpl) throws Throwable {
        C3155ph c3155ph;
        Function1 function1;
        if (continuationImpl instanceof C3155ph) {
            c3155ph = (C3155ph) continuationImpl;
            int i = c3155ph.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3155ph.d = i - Integer.MIN_VALUE;
            } else {
                c3155ph = new C3155ph(this, continuationImpl);
            }
        } else {
            c3155ph = new C3155ph(this, continuationImpl);
        }
        Object objInvoke = c3155ph.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3155ph.d;
        try {
            if (i2 == 0) {
                dern.saneness(objInvoke);
                c3155ph.a = e3;
                c3155ph.d = 1;
                if (a((ContinuationImpl) c3155ph) != objBeachfront) {
                }
                function1 = e3;
                return objBeachfront;
            }
            if (i2 == 1) {
                Function1 function2 = (Function1) c3155ph.a;
                dern.saneness(objInvoke);
                function1 = function2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Object obj = c3155ph.a;
                        dern.saneness(objInvoke);
                        return obj;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) c3155ph.a;
                    dern.saneness(objInvoke);
                    throw th;
                }
                dern.saneness(objInvoke);
            }
            c3155ph.a = objInvoke;
            c3155ph.d = 3;
            if (a(c3155ph) == objBeachfront) {
                return objInvoke;
            }
            function1 = e3;
            return objBeachfront;
            function1 = e3;
            c3155ph.a = null;
            c3155ph.d = 2;
            objInvoke = function1.invoke(c3155ph);
            if (objInvoke != objBeachfront) {
                c3155ph.a = objInvoke;
                c3155ph.d = 3;
                if (a(c3155ph) == objBeachfront) {
                    return objInvoke;
                }
            }
        } catch (Throwable th2) {
            c3155ph.a = th2;
            c3155ph.d = 4;
            if (a(c3155ph) != objBeachfront) {
                throw th2;
            }
        }
        function1 = e3;
        return objBeachfront;
    }
}
