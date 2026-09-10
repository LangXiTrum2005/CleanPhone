package com.inmobi.ads.exceptions;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/inmobi/ads/exceptions/VastException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "mVastErrorCode", "", "(I)V", "<set-?>", "", "telemetryErrorCode", "getTelemetryErrorCode$annotations", "()V", "getTelemetryErrorCode", "()S", "convertVastErrorToTelemetryErrorCode", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VastException extends Exception {
    private final int mVastErrorCode;
    private short telemetryErrorCode;

    public VastException(int i2) {
        this.mVastErrorCode = i2;
    }

    private final void convertVastErrorToTelemetryErrorCode() {
        short s;
        int i2 = this.mVastErrorCode;
        if (i2 == 100) {
            s = 59;
        } else if (i2 == 101) {
            s = 69;
        } else if (i2 == 201) {
            s = 71;
        } else if (i2 == 405) {
            s = 66;
        } else if (i2 == 900) {
            s = 70;
        } else if (i2 == 600) {
            s = 61;
        } else if (i2 == 601) {
            s = 23;
        } else if (i2 == 603) {
            s = 60;
        } else if (i2 != 604) {
            switch (i2) {
                case 300:
                    s = 63;
                    break;
                case 301:
                    s = 72;
                    break;
                case 302:
                    s = 73;
                    break;
                case BaseATView.g.f38290N /* 303 */:
                    s = 74;
                    break;
                default:
                    switch (i2) {
                        case 400:
                            s = 62;
                            break;
                        case 401:
                            s = 64;
                            break;
                        case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                            s = 65;
                            break;
                        case 403:
                            s = 68;
                            break;
                        default:
                            s = 0;
                            break;
                    }
                    break;
            }
        } else {
            s = 67;
        }
        this.telemetryErrorCode = s;
    }

    public static /* synthetic */ void getTelemetryErrorCode$annotations() {
    }

    public final short getTelemetryErrorCode() {
        convertVastErrorToTelemetryErrorCode();
        return this.telemetryErrorCode;
    }
}
