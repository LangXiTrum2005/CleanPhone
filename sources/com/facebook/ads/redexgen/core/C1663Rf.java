package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1663Rf implements AudienceNetworkActivityApi {
    public static byte[] A03;
    public static String[] A04 = {"npa5fyfDyBgpHwGfwNiqfHEj4F8LEiZf", "OqeETugh9", "5goSJATWOcVItDjddk", "82BqGjCZsQ5KSOXOW0A0KlOfyUV9N54d", "DC8qTi6RH4AT7G9O", "9IwTeKuU2aT5NbzWtfQwCWqg5E0PczVH", "CnGxzoUQk", "OIUpXP34AuomSZv"};
    public boolean A00;
    public final AudienceNetworkActivityApi A01;
    public final C1662Re A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {101, 97, 98, 86, 71, 74, 70, 77, 64, 70, 109, 70, 87, 84, 76, 81, 72, 19, 40, 35, 62, 54, 35, 37, 50, 35, 34, 102, 35, 62, 37, 35, 54, 50, 47, 41, 40, 104, 60, 51, 2, 60, 62, 41, 52, 43, 52, 41, 36};
        if (A04[2].length() == 12) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "H3o2ukg7PoWSfztBPt1oK5BMl3p36c0G";
        strArr[0] = "tZaZcqIYCt5A5bsZPeypVNujsThHJ9sw";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C1663Rf(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi, C1662Re c1662Re) {
        this.A01 = audienceNetworkActivityApi;
        this.A02 = c1662Re;
    }

    private void A02(Throwable th) {
        this.A00 = true;
        this.A02.A09();
        finish(8);
        T8 logContext = this.A02.A06();
        if (logContext != null) {
            logContext.A08().ABC(A00(38, 11, 116), AbstractC1712Td.A0C, new C1713Te(th));
            return;
        }
        Log.e(A00(0, 17, 10), A00(17, 21, 111), th);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            if (this.A00) {
                this.A01.dump(str, fileDescriptor, printWriter, strArr);
            } else {
                this.A02.dump(str, fileDescriptor, printWriter, strArr);
            }
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i2) {
        this.A02.finish(i2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i2, int i3, Intent intent) {
        try {
            if (this.A00) {
                this.A01.onActivityResult(i2, i3, intent);
            } else {
                this.A02.onActivityResult(i2, i3, intent);
                this.A01.onActivityResult(i2, i3, intent);
            }
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        try {
            if (this.A00) {
                return;
            }
            this.A02.onBackPressed();
        } catch (Throwable th) {
            if (A04[5].charAt(6) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "nPADpKrXuoueUGX";
            strArr[4] = "T13akIzntQNSUZag";
            A02(th);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        try {
            if (this.A00) {
                this.A01.onConfigurationChanged(configuration);
                return;
            }
            this.A02.onConfigurationChanged(configuration);
            this.A01.onConfigurationChanged(configuration);
            String[] strArr = A04;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Q1wJ3SQKEGYG95X";
            strArr2[4] = "AvO5pGxADzIyCHUj";
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        this.A01.onCreate(bundle);
        try {
            this.A02.onCreate(bundle);
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        try {
            if (this.A00) {
                this.A01.onDestroy();
            } else {
                this.A02.onDestroy();
                this.A01.onDestroy();
            }
        } catch (Throwable th) {
            if (A04[2].length() == 12) {
                throw new RuntimeException();
            }
            A04[2] = "3CPJLXRae2337PFMI";
            A02(th);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        try {
            if (this.A00) {
                this.A01.onPause();
            } else {
                this.A02.onPause();
                this.A01.onPause();
            }
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A01.onResume();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onResume();
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
        try {
            if (this.A00) {
                return;
            }
            this.A02.onSaveInstanceState(bundle);
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A01.onStart();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStart();
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A01.onStop();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStop();
        } catch (Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.A00) {
                return this.A01.onTouchEvent(motionEvent);
            }
            this.A02.onTouchEvent(motionEvent);
            return this.A01.onTouchEvent(motionEvent);
        } catch (Throwable t) {
            A02(t);
        }
    }
}
