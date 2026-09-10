package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class W1 implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0472n2 f27520a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27521a;

        static {
            int[] iArr = new int[C0.values().length];
            try {
                iArr[C0.LOAD_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C0.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C0.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C0.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C0.AUCTION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C0.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C0.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C0.AD_OPENED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C0.AD_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C0.SHOW_AD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C0.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C0.AD_CLICKED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[C0.AD_REWARDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[C0.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[C0.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[C0.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f27521a = iArr;
        }
    }

    public W1(C0472n2 auctionData) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        this.f27520a = auctionData;
    }

    private final boolean b(C0 c4) {
        switch (a.f27521a[c4.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        kotlin.jvm.internal.n.f(event, "event");
        HashMap map = new HashMap();
        JSONObject jSONObjectH = this.f27520a.h();
        if (jSONObjectH != null && jSONObjectH.length() > 0) {
            map.put("genericParams", jSONObjectH);
        }
        if (b(event)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f27520a.i()));
            if (!TextUtils.isEmpty(this.f27520a.f())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f27520a.f());
            }
        }
        if (!TextUtils.isEmpty(this.f27520a.g())) {
            map.put("auctionId", this.f27520a.g());
        }
        return map;
    }
}
