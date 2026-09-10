package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBNativeAdvancedHandler {
    private c nativeAdvancedProvider;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.MBNativeAdvancedHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum;

        static {
            int[] iArr = new int[MBMultiStateEnum.values().length];
            $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum = iArr;
            try {
                iArr[MBMultiStateEnum.negative.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.undefined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBNativeAdvancedHandler(Activity activity, String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        this.nativeAdvancedProvider = new c(str, str2, activity);
    }

    public void autoLoopPlay(int i10) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    public ViewGroup getAdViewGroup() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        c cVar = this.nativeAdvancedProvider;
        return cVar != null ? cVar.c() : "";
    }

    public String getRequestId() {
        c cVar = this.nativeAdvancedProvider;
        return cVar != null ? cVar.e() : "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void load() throws Throwable {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.c("");
        }
    }

    public void loadByToken(String str) throws Throwable {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.d(str);
        }
    }

    public void onPause() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.f(3);
        }
    }

    public void onResume() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.i(3);
        }
    }

    public void release() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void setAdListener(NativeAdvancedAdListener nativeAdvancedAdListener) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.a(nativeAdvancedAdListener);
        }
    }

    public void setCloseButtonState(MBMultiStateEnum mBMultiStateEnum) {
        int i10 = AnonymousClass1.$SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[mBMultiStateEnum.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            i11 = -1;
        }
        this.nativeAdvancedProvider.b(i11);
    }

    public void setNativeViewSize(int i10, int i11) {
        this.nativeAdvancedProvider.b(i11, i10);
    }

    public void setPlayMuteState(int i10) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.d(i10);
        }
    }

    public void setViewElementStyle(JSONObject jSONObject) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.b(jSONObject);
        }
    }

    public boolean isReady(String str) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.b(str);
        }
        return false;
    }
}
