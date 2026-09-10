package androidx.compose.ui.text.font;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/impromptu;", "font", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "result", "", "forever", "", "marial", "(Landroidx/compose/ui/text/font/impromptu;Landroidx/compose/ui/text/font/cord;Ljava/lang/Object;Z)V", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$attabal;", "wireman", "(Landroidx/compose/ui/text/font/impromptu;Landroidx/compose/ui/text/font/cord;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$attabal;", "Lkotlin/Function1;", "Lwretchedly/dern;", "block", "competently", "(Landroidx/compose/ui/text/font/impromptu;Landroidx/compose/ui/text/font/cord;ZLkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "attabal", "Ljava/lang/Object;", "PermanentFailure", "Ldent/saneness;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$saneness;", "saneness", "Ldent/saneness;", "resultCache", "Ldent/dern;", "dern", "Ldent/dern;", "permanentCache", "Lcultivated/impromptu;", "Lcultivated/impromptu;", "cacheLock", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object PermanentFailure = attabal.saneness(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dent.saneness<Key, attabal> resultCache = new dent.saneness<>(16);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final dent.dern<Key, attabal> permanentCache = new dent.dern<>(0, 1, null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cultivated.impromptu cacheLock = cultivated.competently.attabal();

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$saneness, reason: from toString */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$saneness;", "", "Landroidx/compose/ui/text/font/impromptu;", "font", "loaderKey", "<init>", "(Landroidx/compose/ui/text/font/impromptu;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Landroidx/compose/ui/text/font/impromptu;", "getFont", "()Landroidx/compose/ui/text/font/impromptu;", "saneness", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final impromptu font;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final Object loaderKey;

        public Key(impromptu impromptuVar, Object obj) {
            this.font = impromptuVar;
            this.loaderKey = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.wireman(this.font, key.font) && Intrinsics.wireman(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void beachfront(AsyncTypefaceCache asyncTypefaceCache, impromptu impromptuVar, cord cordVar, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.marial(impromptuVar, cordVar, obj, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object competently(impromptu impromptuVar, cord cordVar, boolean z, Function1<? super wretchedly.dern<Object>, ? extends Object> function1, wretchedly.dern<Object> dernVar) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        Key key;
        AsyncTypefaceCache asyncTypefaceCache;
        if (dernVar instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) dernVar;
            int i = asyncTypefaceCache$runCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, dernVar);
            }
        } else {
            asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, dernVar);
        }
        Object obj = asyncTypefaceCache$runCached$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = asyncTypefaceCache$runCached$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Key key2 = new Key(impromptuVar, cordVar.dern());
            synchronized (this.cacheLock) {
                try {
                    attabal attabalVarWireman = this.resultCache.wireman(key2);
                    if (attabalVarWireman == null) {
                        attabalVarWireman = this.permanentCache.saneness(key2);
                    }
                    if (attabalVarWireman != null) {
                        return attabalVarWireman.getResult();
                    }
                    Unit unit = Unit.f29295attabal;
                    asyncTypefaceCache$runCached$1.L$0 = this;
                    asyncTypefaceCache$runCached$1.L$1 = key2;
                    asyncTypefaceCache$runCached$1.Z$0 = z;
                    asyncTypefaceCache$runCached$1.label = 1;
                    Object objInvoke = function1.invoke(asyncTypefaceCache$runCached$1);
                    if (objInvoke == objBeachfront) {
                        return objBeachfront;
                    }
                    obj = objInvoke;
                    key = key2;
                    asyncTypefaceCache = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = asyncTypefaceCache$runCached$1.Z$0;
            key = (Key) asyncTypefaceCache$runCached$1.L$1;
            asyncTypefaceCache = (AsyncTypefaceCache) asyncTypefaceCache$runCached$1.L$0;
            p002kotlin.dern.saneness(obj);
        }
        synchronized (asyncTypefaceCache.cacheLock) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.permanentCache.impromptu(key, attabal.attabal(asyncTypefaceCache.PermanentFailure));
                } else if (z) {
                    asyncTypefaceCache.permanentCache.impromptu(key, attabal.attabal(attabal.saneness(obj)));
                } else {
                    asyncTypefaceCache.resultCache.marial(key, attabal.attabal(attabal.saneness(obj)));
                }
                Unit unit2 = Unit.f29295attabal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final void marial(impromptu font, cord platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.dern());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.impromptu(key, attabal.attabal(this.PermanentFailure));
                } else if (forever) {
                    this.permanentCache.impromptu(key, attabal.attabal(attabal.saneness(result)));
                } else {
                    this.resultCache.marial(key, attabal.attabal(attabal.saneness(result)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final attabal wireman(impromptu font, cord platformFontLoader) {
        attabal attabalVarWireman;
        Key key = new Key(font, platformFontLoader.dern());
        synchronized (this.cacheLock) {
            attabalVarWireman = this.resultCache.wireman(key);
            if (attabalVarWireman == null) {
                attabalVarWireman = this.permanentCache.saneness(key);
            }
        }
        return attabalVarWireman;
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$attabal;", "", "result", "saneness", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "beachfront", "(Ljava/lang/Object;)Ljava/lang/String;", "", "wireman", "(Ljava/lang/Object;)I", C3414a2.d, "", "dern", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "attabal", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "marial", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Object result;

        public /* synthetic */ attabal(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ attabal attabal(Object obj) {
            return new attabal(obj);
        }

        public static String beachfront(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public static boolean dern(Object obj, Object obj2) {
            return (obj2 instanceof attabal) && Intrinsics.wireman(obj, ((attabal) obj2).getResult());
        }

        public static final boolean marial(Object obj) {
            return obj == null;
        }

        public static int wireman(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: competently, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public boolean equals(Object obj) {
            return dern(this.result, obj);
        }

        public int hashCode() {
            return wireman(this.result);
        }

        public String toString() {
            return beachfront(this.result);
        }

        public static Object saneness(Object obj) {
            return obj;
        }
    }
}
