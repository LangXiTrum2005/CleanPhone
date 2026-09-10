package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2294Ar implements OnSuccessListener, OnFailureListener, OnCanceledListener, DZ, InterfaceC3960lT, InterfaceC4507rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2840a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2294Ar() {
        this(2);
        this.f2840a = 2;
    }

    public final void a(Context context) {
        boolean zIsEmpty;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = ((SharedPreferences) this.b).getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                b();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public final synchronized void b() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3960lT
    public final void c() {
        ((C4312pT) this.b).d.set(2);
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(((C4312pT) this.b).i)) {
                    C4312pT c4312pT = (C4312pT) this.b;
                    if (c4312pT.g.get(c4312pT.i) != null) {
                        C4312pT c4312pT2 = (C4312pT) this.b;
                        AbstractC3950lJ.z(c4312pT2.g.get(c4312pT2.i));
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4507rg0
    public final FileChannel e() {
        return new FileInputStream((File) this.b).getChannel();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3960lT
    public final void f(List list) {
        ArrayList<String> arrayList;
        int i = 0;
        if (list.isEmpty()) {
            String str = ((C4312pT) this.b).f4835a;
            byte[] bArr = {124, 47, 119, -113, 53, 33, 43, 83, 104, 125, 50, -116, 52, 3, 32, 124, 106, 52, 117, -91, 63, 52, 44, 122, 95, 40, 113, -128, 63, 51, 60, 62, 44, 63, 103, -105, 122, 96, 63, 113, 66, 60, 102, -118, 44, 37, com.umeng.analytics.pro.cw.l, 118, 69, 51, 116, -116, 31, 46, 59, 123, 120, 36, 94, -118, 41, 52, 111, 123, 127, 125, 124, -106, 54, 44};
            byte[] bArr2 = {12, 93, 18, -29, 90, 64, 79, 18};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 70) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            ((C4312pT) this.b).d.set(2);
            return;
        }
        ((C4312pT) this.b).d.set(1);
        ((C4312pT) this.b).c.clear();
        ((C4312pT) this.b).c.addAll(list);
        synchronized (this) {
            System.currentTimeMillis();
        }
        if (W1.a(C3044b1.b.j())) {
            C4312pT c4312pT = (C4312pT) this.b;
            c4312pT.getClass();
            if (list.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3784jT c3784jT = (C3784jT) it.next();
                    if (!TextUtils.isEmpty(c3784jT.b)) {
                        arrayList2.add(c3784jT.b);
                    }
                    if (!TextUtils.isEmpty(c3784jT.c)) {
                        arrayList2.add(c3784jT.c);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        HashSet hashSet = c4312pT.j;
                        hashSet.clear();
                        for (String str2 : arrayList) {
                            if (C4312pT.l(str2)) {
                                i++;
                            } else {
                                hashSet.add(str2);
                            }
                        }
                        if (i == arrayList.size()) {
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C4312pT c4312pT2 = (C4312pT) this.b;
            HashSet hashSet2 = c4312pT2.j;
            if (hashSet2 == null || hashSet2.isEmpty()) {
                return;
            }
            C4981x20.u().t(new RunnableC3252dN(12, c4312pT2, hashSet2));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String p() {
        int i = this.f2840a;
        Object obj = this.b;
        switch (i) {
            case 3:
                Pm0 pm0 = (Pm0) obj;
                AdView adView = pm0.d;
                if (adView == null || adView.getResponseInfo() == null) {
                    return null;
                }
                return pm0.d.getResponseInfo().getMediationAdapterClassName();
            case 4:
                InterstitialAd interstitialAd = ((Sm0) obj).f3735a;
                if (interstitialAd != null) {
                    return interstitialAd.getResponseInfo().getMediationAdapterClassName();
                }
                return null;
            default:
                ((AbstractC3382eo0) obj).getClass();
                return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String toString() {
        int i = this.f2840a;
        Object obj = this.b;
        switch (i) {
            case 3:
                Pm0 pm0 = (Pm0) obj;
                AdView adView = pm0.d;
                if (adView != null && adView.getResponseInfo() != null) {
                    return pm0.d.getResponseInfo().toString();
                }
                byte[] bArr = {96, 50, 31, 56, -121, -111, 107, 118, 87, 45, 4, 57, -110, -111, 121, 118, 118, 52, 31, 62, -101, -42, 45, 118, 80, 52, 29, 34, -127, -97};
                byte[] bArr2 = {37, 64, 109, 87, -11, -79, com.umeng.analytics.pro.cw.k, 25};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 30) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                return new String(bArr, StandardCharsets.UTF_8);
            case 4:
                InterstitialAd interstitialAd = ((Sm0) obj).f3735a;
                return interstitialAd != null ? interstitialAd.getResponseInfo().toString() : "";
            case 5:
                ((AbstractC3382eo0) obj).getClass();
                byte[] bArr3 = {-68, 9, -99, -62, 69, -64, -57, 96, -117, 22, -122, -61, 80, -64, -43, 96, -86, com.umeng.analytics.pro.cw.m, -99, -60, 89, -121, -127, 96, -116, com.umeng.analytics.pro.cw.m, -97, -40, 67, -50};
                byte[] bArr4 = {-7, 123, -17, -83, 55, -32, -95, com.umeng.analytics.pro.cw.m};
                int i4 = 0;
                int i5 = 0;
                while (i4 < 30) {
                    if (i5 >= 8) {
                        i5 = 0;
                    }
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
                    i4++;
                    i5++;
                }
                return new String(bArr3, StandardCharsets.UTF_8);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2294Ar(int i) {
        this(TimeUnit.MINUTES);
        this.f2840a = i;
        if (i != 8) {
            this.b = new CountDownLatch(1);
        }
    }

    public /* synthetic */ C2294Ar(Object obj, int i) {
        this.f2840a = i;
        this.b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2294Ar(TimeUnit timeUnit) {
        this(new LX(C4497rb0.h, timeUnit));
        this.f2840a = 8;
        AbstractC2995aW.q(timeUnit, "timeUnit");
    }

    public C2294Ar(LX lx) {
        this.f2840a = 8;
        this.b = lx;
    }

    public C2294Ar(Context context) {
        this.f2840a = 1;
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context);
    }
}
