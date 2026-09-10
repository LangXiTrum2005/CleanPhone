package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.smartdigimkt.a6.d;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class V5 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final X9 A03;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + d.o);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, 11, 5, 7, 33, 21, 6, 13, 33, 24, 7, 20, 21, 11, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = V5.class.getSimpleName();
    }

    public V5(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = X9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C2414id A01(C2410iY c2410iY, String str) {
        C2414id c2414id = new C2414id(c2410iY, this.A03, str);
        c2414id.A0G(c2410iY.A0B(), c2410iY.A07());
        return c2414id;
    }

    private C2411iZ A02(C2395iI c2395iI, String str) {
        C2411iZ c2411iZ = new C2411iZ(c2395iI, this.A03, str);
        c2411iZ.A0J(c2395iI.A05, c2395iI.A02, c2395iI.A08);
        return c2411iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C2300gi c2300giA05 = C1673Rp.A05(this.A00, callingAppPackage);
            c2300giA05.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                c2300giA05.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    V2 v2A04 = X9.A00().A04(callingAppPackage);
                    if (v2A04 == null) {
                        v2A04 = X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C2410iY intAdModel = OX.A04(c2300giA05, msg.getData(), strVerifyPackage);
                    if (v2A04.A00 == null) {
                        v2A04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (v2A04.A00 instanceof C2414id) {
                        ((C2414id) v2A04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    X9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case TTAdConstant.IMAGE_MODE_1012 /* 1012 */:
                case 2002:
                    X9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    V2 v2A05 = X9.A00().A04(callingAppPackage);
                    if (v2A05 == null) {
                        v2A05 = X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C2395iI c2395iIA05 = OX.A05(c2300giA05, msg.getData(), strVerifyPackage);
                    if (v2A05.A00 == null) {
                        v2A05.A00 = A02(c2395iIA05, callingAppPackage);
                    } else if (v2A05.A00 instanceof C2411iZ) {
                        C2411iZ c2411iZ = (C2411iZ) v2A05.A00;
                        String adId = c2395iIA05.A05;
                        c2411iZ.A0J(adId, c2395iIA05.A02, c2395iIA05.A08);
                    }
                    X9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    OG ogA03 = X9.A00().A03(callingAppPackage);
                    if (ogA03 instanceof C2411iZ) {
                        RewardData rewardDataA01 = OY.A01(msg.getData());
                        C2411iZ c2411iZ2 = (C2411iZ) ogA03;
                        if (rewardDataA01 != null) {
                            c2411iZ2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            WU.A00(th, this);
        }
    }
}
