package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import p002kotlin.Result;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    public AFj1gSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t, boolean z) {
        Object objM3351constructorimpl;
        Object objM3351constructorimpl2;
        Object revenue;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            kurbash.wireman[] wiremanVarArr = {p002kotlin.jvm.internal.polloi.saneness(ConcurrentModificationException.class), p002kotlin.jvm.internal.polloi.saneness(ArrayIndexOutOfBoundsException.class)};
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                try {
                    if (!p002kotlin.collections.polloi.polder(wiremanVarArr, p002kotlin.jvm.internal.polloi.saneness(thM3354exceptionOrNullimpl.getClass()))) {
                        throw thM3354exceptionOrNullimpl;
                    }
                    if (z) {
                        revenue = getRevenue(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, thM3354exceptionOrNullimpl, false, false);
                        revenue = t;
                    }
                    objM3351constructorimpl2 = Result.m3351constructorimpl(revenue);
                    objM3351constructorimpl = objM3351constructorimpl2;
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM3351constructorimpl2 = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
                }
            }
            Throwable thM3354exceptionOrNullimpl2 = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl2 == null) {
                t = (T) objM3351constructorimpl;
            } else {
                AFLogger.afErrorLog(str, thM3354exceptionOrNullimpl2, false, false);
            }
        }
        return t;
    }

    public final String AFAdRevenueData(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getRevenue(new Function0<String>() { // from class: com.appsflyer.internal.AFj1gSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final <T extends Parcelable> T H_(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getRevenue(new Function0<T>() { // from class: com.appsflyer.internal.AFj1gSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final Intent I_(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getRevenue(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1gSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(str, j);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMediationNetwork(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getRevenue(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1gSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
