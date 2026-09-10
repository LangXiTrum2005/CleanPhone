package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayAdError {
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f38494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38496c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String adId, String str) {
        n.f(adId, "adId");
        this.f38494a = ironSourceError;
        this.f38495b = adId;
        this.f38496c = str;
    }

    public final String getAdId() {
        return this.f38495b;
    }

    public final String getAdUnitId() {
        return this.f38496c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f38494a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f38494a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        String str = this.f38496c;
        IronSourceError ironSourceError = this.f38494a;
        return d.g("adUnitId: ", str, " ", ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, g gVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String adId, String adUnitId, int i10, String errorMessage) {
        this(new IronSourceError(i10, errorMessage), adId, adUnitId);
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(errorMessage, "errorMessage");
    }
}
