package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/vd;", "", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface vd {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/vd$a;", "", "Lcom/ironsource/vd$c;", "a", "strategyType", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/vd$c;", "b", "()Lcom/ironsource/vd$c;", "<init>", "(Lcom/ironsource/vd$c;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c strategyType;

        public a(c strategyType) {
            Intrinsics.f(strategyType, "strategyType");
            this.strategyType = strategyType;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cVar = aVar.strategyType;
            }
            return aVar.a(cVar);
        }

        public final c b() {
            return this.strategyType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.strategyType == ((a) other).strategyType;
        }

        public int hashCode() {
            return this.strategyType.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.strategyType + ')';
        }

        public final a a(c strategyType) {
            Intrinsics.f(strategyType, "strategyType");
            return new a(strategyType);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getStrategyType() {
            return this.strategyType;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/vd$b;", "", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/vd$a;", com.smartdigimkt.q0.b.i0, "Lcom/ironsource/rd;", "fullscreenAdUnitFactory", "Lcom/ironsource/td;", "fullscreenAdUnitListener", "Lcom/ironsource/ud;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/vd;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27502a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27502a = iArr;
            }
        }

        public final vd a(m1 adTools, a config, rd fullscreenAdUnitFactory, td fullscreenAdUnitListener, ud listener) {
            Intrinsics.f(adTools, "adTools");
            Intrinsics.f(config, "config");
            Intrinsics.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.f(listener, "listener");
            int i2 = a.f27502a[config.b().ordinal()];
            if (i2 == 1) {
                return new je(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i2 == 2) {
                return new ce(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i2 == 3) {
                return new wd(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ironsource/vd$c;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String description;

        c(String str) {
            this.description = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }
    }

    void a(Activity activity);

    void loadAd();
}
