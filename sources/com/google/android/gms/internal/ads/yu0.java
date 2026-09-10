package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 implements ha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f22374a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h00 f22376c;

    public yu0(Context context, h00 h00Var) {
        this.f22375b = context;
        this.f22376c = h00Var;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f22374a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Bundle b() {
        String str;
        Bundle bundle;
        boolean z10;
        Bundle bundle2;
        h00 h00Var = this.f22376c;
        Context context = this.f22375b;
        h00Var.getClass();
        HashSet<b00> hashSet = new HashSet();
        synchronized (h00Var.f15012a) {
            HashSet hashSet2 = h00Var.f15016e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        g00 g00Var = h00Var.f15015d;
        md0 md0Var = h00Var.f15014c;
        synchronized (md0Var) {
            str = (String) md0Var.f17400c;
        }
        synchronized (g00Var.f14633f) {
            try {
                bundle = new Bundle();
                if (!g00Var.f14636i.zzx()) {
                    bundle.putString("session_id", g00Var.f14635h);
                }
                bundle.putLong("basets", g00Var.f14629b);
                bundle.putLong("currts", g00Var.f14628a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", g00Var.f14630c);
                bundle.putInt("preqs_in_session", g00Var.f14631d);
                bundle.putLong("time_in_session", g00Var.f14632e);
                bundle.putInt("pclick", g00Var.f14637j);
                bundle.putInt("pimp", g00Var.f14638k);
                int i10 = tx.f20518a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
                if (identifier == 0) {
                    int i11 = zze.zza;
                    zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z10 = true;
                            bundle.putBoolean("support_transparent_background", z10);
                            synchronized (g00Var.f14633f) {
                                int i12 = g00Var.l;
                            }
                            bundle.putInt("consent_form_action_identifier", i12);
                        } else {
                            int i13 = zze.zza;
                            zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i14 = zze.zza;
                        zzo.zzi("Fail to fetch AdActivity theme");
                        zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                z10 = false;
                bundle.putBoolean("support_transparent_background", z10);
                synchronized (g00Var.f14633f) {
                    int i15 = g00Var.l;
                    bundle.putInt("consent_form_action_identifier", i15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle3.putBundle(MBridgeConstans.DYNAMIC_VIEW_WX_APP, bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = h00Var.f15017f.iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.measurement.f2.j(it);
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b00 b00Var : hashSet) {
            synchronized (b00Var.f12577d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", b00Var.f12578e);
                    bundle2.putString("slotid", b00Var.f12579f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", b00Var.f12583j);
                    bundle2.putLong("tresponse", b00Var.f12584k);
                    bundle2.putLong("timp", b00Var.f12580g);
                    bundle2.putLong("tload", b00Var.f12581h);
                    bundle2.putLong("pcc", b00Var.f12582i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (a00 a00Var : b00Var.f12576c) {
                        a00Var.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", a00Var.f11793a);
                        bundle5.putLong("tclose", a00Var.f11794b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, arrayList);
        a(hashSet);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final synchronized void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            h00 h00Var = this.f22376c;
            HashSet hashSet = this.f22374a;
            synchronized (h00Var.f15012a) {
                h00Var.f15016e.addAll(hashSet);
            }
        }
    }
}
