package com.unity3d.services.core.extensions;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.g0;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ln.a;
import ln.c;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aB\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00032\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\";\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000ej\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Lkotlin/Function1;", "Lak/f;", "", "block", "Lwj/h;", "runSuspendCatching", "(Ljk/b;Lak/f;)Ljava/lang/Object;", "runReturnSuspendCatching", RequestConfiguration.MAX_AD_CONTENT_RATING_T, X3.i.W, "action", "memoize", "(Ljava/lang/Object;Ljk/b;Lak/f;)Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "Lcn/g0;", "Lkotlin/collections/LinkedHashMap;", "deferreds", "Ljava/util/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "Lln/a;", "mutex", "Lln/a;", "getMutex", "()Lln/a;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, g0> deferreds = new LinkedHashMap<Object, g0>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        public /* bridge */ boolean containsValue(g0 g0Var) {
            return super.containsValue((Object) g0Var);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, g0>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, g0>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<g0> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public /* bridge */ boolean remove(Object obj, g0 g0Var) {
            return super.remove(obj, (Object) g0Var);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, g0> eldest) {
            n.f(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<g0> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof g0) {
                return containsValue((g0) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof g0)) {
                return remove(obj, (g0) obj2);
            }
            return false;
        }
    };
    private static final a mutex = new c();

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE, 45}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ b $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, b bVar, f fVar) {
            super(2, fVar);
            this.$key = obj;
            this.$action = bVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            Object obj2;
            b bVar;
            a aVar;
            int i10 = this.label;
            bk.a aVar2 = bk.a.f5708a;
            try {
                if (i10 == 0) {
                    t9.e.z(obj);
                    a0Var = (a0) this.L$0;
                    a mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    b bVar2 = this.$action;
                    this.L$0 = a0Var;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = bVar2;
                    this.label = 1;
                    c cVar = (c) mutex;
                    if (cVar.e(this) != aVar2) {
                        obj2 = obj3;
                        bVar = bVar2;
                        aVar = cVar;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                bVar = (b) this.L$3;
                obj2 = this.L$2;
                aVar = (a) this.L$1;
                a0Var = (a0) this.L$0;
                t9.e.z(obj);
                LinkedHashMap<Object, g0> deferreds = CoroutineExtensionsKt.getDeferreds();
                g0 g0VarG = deferreds.get(obj2);
                if (g0VarG == null) {
                    g0VarG = d0.g(a0Var, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(bVar, null), 3);
                    deferreds.put(obj2, g0VarG);
                }
                g0 g0Var = g0VarG;
                ((c) aVar).g(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objO = g0Var.o(this);
                return objO == aVar2 ? aVar2 : objO;
            } catch (Throwable th2) {
                ((c) aVar).g(null);
                throw th2;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            a0 a0Var = (a0) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            b bVar = this.$action;
            c cVar = (c) mutex;
            cVar.e(this);
            try {
                LinkedHashMap<Object, g0> deferreds = CoroutineExtensionsKt.getDeferreds();
                g0 g0VarG = deferreds.get(obj2);
                if (g0VarG == null) {
                    g0VarG = d0.g(a0Var, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(bVar, null), 3);
                    deferreds.put(obj2, g0VarG);
                }
                return g0VarG.o(this);
            } finally {
                cVar.g(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE}, m = "runReturnSuspendCatching")
    public static final class AnonymousClass1<R> extends ck.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRunReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
            return objRunReturnSuspendCatching == bk.a.f5708a ? objRunReturnSuspendCatching : new h(objRunReturnSuspendCatching);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {15}, m = "runSuspendCatching")
    public static final class C08311<R> extends ck.c {
        int label;
        /* synthetic */ Object result;

        public C08311(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objRunSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
            return objRunSuspendCatching == bk.a.f5708a ? objRunSuspendCatching : new h(objRunSuspendCatching);
        }
    }

    public static final LinkedHashMap<Object, g0> getDeferreds() {
        return deferreds;
    }

    public static final a getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, b bVar, f fVar) {
        return d0.k(new AnonymousClass2(obj, bVar, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object runReturnSuspendCatching(b bVar, f fVar) {
        AnonymousClass1 anonymousClass1;
        Throwable thA;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objC = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                t9.e.z(objC);
                anonymousClass1.label = 1;
                objC = bVar.invoke(anonymousClass1);
                Object obj = bk.a.f5708a;
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(objC);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        return ((objC instanceof g) && (thA = h.a(objC)) != null) ? t9.e.c(thA) : objC;
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(b bVar, f fVar) {
        Object objC;
        Throwable thA;
        try {
            objC = bVar.invoke(fVar);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        return ((objC instanceof g) && (thA = h.a(objC)) != null) ? t9.e.c(thA) : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object runSuspendCatching(b bVar, f fVar) {
        C08311 c08311;
        if (fVar instanceof C08311) {
            c08311 = (C08311) fVar;
            int i10 = c08311.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08311.label = i10 - Integer.MIN_VALUE;
            } else {
                c08311 = new C08311(fVar);
            }
        } else {
            c08311 = new C08311(fVar);
        }
        Object obj = c08311.result;
        int i11 = c08311.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            c08311.label = 1;
            Object objInvoke = bVar.invoke(c08311);
            Object obj2 = bk.a.f5708a;
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            return t9.e.c(th2);
        }
    }

    private static final <R> Object runSuspendCatching$$forInline(b bVar, f fVar) {
        try {
            return bVar.invoke(fVar);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            return t9.e.c(th2);
        }
    }
}
