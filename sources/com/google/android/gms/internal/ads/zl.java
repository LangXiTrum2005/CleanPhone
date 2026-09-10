package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzba;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl implements q81, zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22650b;

    public /* synthetic */ zl(Context context, int i10) {
        this.f22649a = i10;
        this.f22650b = context;
    }

    public m22 a(o8 o8Var) throws Exception {
        String str;
        MediaCodec mediaCodecCreateByCodecName;
        int i10;
        n22 h22Var;
        Context context;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        e22 e22Var = null;
        MediaCodec mediaCodec = null;
        e22Var = null;
        if (i11 < 31 && ((context = this.f22650b) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                p22 p22Var = (p22) o8Var.f18181b;
                String str2 = p22Var.f18452a;
                Trace.beginSection("createCodec:".concat(str2));
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str2);
                Trace.endSection();
                try {
                    Trace.beginSection("configureCodec");
                    Surface surface = (Surface) o8Var.f18184e;
                    if (surface == null && p22Var.f18459h && i11 >= 35) {
                        i12 = 8;
                    }
                    mediaCodecCreateByCodecName2.configure((MediaFormat) o8Var.f18182c, surface, (MediaCrypto) null, i12);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName2.start();
                    Trace.endSection();
                    return new l22(mediaCodecCreateByCodecName2, (l22) o8Var.f18185f);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e11) {
                e = e11;
            }
        } else {
            int iE = na.e(((g22) o8Var.f18183d).f14678o);
            switch (iE) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = "unknown";
                    break;
                case 0:
                    str = BuildConfig.FLAVOR;
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = TtmlNode.TAG_METADATA;
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            v71.r("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            p22 p22Var2 = (p22) o8Var.f18181b;
            String str3 = p22Var2.f18452a;
            try {
                StringBuilder sb2 = new StringBuilder(str3.length() + 12);
                sb2.append("createCodec:");
                sb2.append(str3);
                Trace.beginSection(sb2.toString());
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                try {
                    if (i11 >= 36) {
                        h22Var = new uo0(mediaCodecCreateByCodecName, 19);
                        i10 = 4;
                    } else {
                        i10 = 0;
                        h22Var = new h22(mediaCodecCreateByCodecName, new HandlerThread(e22.G(iE, "ExoPlayer:MediaCodecQueueingThread:")));
                    }
                    e22 e22Var2 = new e22(mediaCodecCreateByCodecName, new HandlerThread(e22.G(iE, "ExoPlayer:MediaCodecAsyncAdapter:")), h22Var, (l22) o8Var.f18185f);
                    try {
                        Trace.endSection();
                        Surface surface2 = (Surface) o8Var.f18184e;
                        if (surface2 == null && p22Var2.f18459h && i11 >= 35) {
                            i10 |= 8;
                        }
                        e22Var2.F((MediaFormat) o8Var.f18182c, surface2, i10);
                        return e22Var2;
                    } catch (Exception e12) {
                        e = e12;
                        e22Var = e22Var2;
                        if (e22Var != null) {
                            e22Var.zzl();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Exception e14) {
                e = e14;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020b A[Catch: all -> 0x00de, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x013e A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0142 A[Catch: all -> 0x00de, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0172 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183 A[Catch: all -> 0x00de, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0191 A[Catch: all -> 0x00de, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3 A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x009b, blocks: (B:24:0x0094, B:26:0x0098, B:30:0x009e, B:32:0x00a3, B:33:0x00a5, B:35:0x00b7, B:36:0x00bb, B:37:0x00bd, B:63:0x0134, B:64:0x0138, B:65:0x013b, B:74:0x016d, B:93:0x01d3, B:114:0x0248, B:115:0x024f, B:117:0x0251, B:118:0x0258, B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4), top: B:131:0x0094, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6 A[Catch: all -> 0x00de, TryCatch #8 {all -> 0x00de, blocks: (B:38:0x00d1, B:52:0x00ee, B:55:0x00f9, B:56:0x0103, B:58:0x0109, B:60:0x0119, B:62:0x0130, B:67:0x013e, B:69:0x0142, B:71:0x0152, B:73:0x0169, B:76:0x0172, B:88:0x01c9, B:95:0x01d9, B:97:0x01e6, B:99:0x01f4, B:100:0x01fd, B:102:0x020b, B:104:0x020f, B:105:0x0212, B:107:0x0216, B:109:0x0236, B:111:0x0242, B:112:0x0245, B:113:0x0246, B:79:0x0183, B:81:0x0191, B:83:0x0199, B:85:0x01b9, B:86:0x01bc, B:90:0x01cd, B:91:0x01d0, B:41:0x00d7, B:47:0x00e4, B:84:0x019d), top: B:138:0x00d1, outer: #4, inners: #6 }] */
    @Override // com.google.android.gms.internal.ads.q81
    public Object zza() {
        Context applicationContext;
        SharedPreferences sharedPreferencesA;
        SharedPreferences sharedPreferences;
        StrictMode.ThreadPolicy threadPolicy;
        String string;
        SharedPreferences sharedPreferences2;
        StrictMode.ThreadPolicy threadPolicy2;
        SharedPreferences sharedPreferences3;
        ConditionVariable conditionVariable;
        pb pbVar;
        z zVar;
        Context applicationContext2 = null;
        switch (this.f22649a) {
            case 0:
                ul ulVar = am.f12058a;
                yl ylVarZzc = zzba.zzc();
                Context applicationContext3 = this.f22650b;
                if (!ylVarZzc.f22292c) {
                    synchronized (ylVarZzc.f22290a) {
                        try {
                            if (!ylVarZzc.f22292c) {
                                if (!ylVarZzc.f22293d) {
                                    ylVarZzc.f22293d = true;
                                }
                                ylVarZzc.f22298i = TextUtils.equals(applicationContext3.getPackageName(), "com.google.android.gms");
                                if (applicationContext3.getApplicationContext() != null) {
                                    applicationContext3 = applicationContext3.getApplicationContext();
                                }
                                ylVarZzc.f22296g = applicationContext3;
                                try {
                                    ylVarZzc.f22295f = r9.c.a(applicationContext3).d(128, ylVarZzc.f22296g.getPackageName()).metaData;
                                    break;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context = ylVarZzc.f22296g;
                                    if (context == null) {
                                        context = null;
                                    } else {
                                        try {
                                            applicationContext = context.createPackageContext("com.google.android.gms", 0);
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            applicationContext = null;
                                        }
                                        if (applicationContext != null || (applicationContext = context.getApplicationContext()) != null) {
                                            context = applicationContext;
                                        }
                                    }
                                    if (context != null) {
                                        zzba.zza();
                                        sharedPreferencesA = wl.a(context);
                                    } else {
                                        sharedPreferencesA = null;
                                    }
                                    if (sharedPreferencesA != null) {
                                        un.f20825a.set(new xl(ylVarZzc, sharedPreferencesA));
                                    }
                                    if (!ylVarZzc.f22298i) {
                                        pb pbVar2 = zm.f22662d;
                                        if (((Long) pbVar2.o()).longValue() > 0 && x10.B(ylVarZzc.f22296g, "crash_without_write") >= ((Long) pbVar2.o()).longValue()) {
                                            ylVarZzc.f22299j = true;
                                            ylVarZzc.f22292c = true;
                                            ylVarZzc.f22293d = false;
                                            conditionVariable = ylVarZzc.f22291b;
                                        } else if (ylVarZzc.f22298i) {
                                            Context context2 = ylVarZzc.f22296g;
                                            if (!((Boolean) fn.f14473k.o()).booleanValue()) {
                                                if (((Boolean) fn.l.o()).booleanValue()) {
                                                    threadPolicy = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                    string = sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy);
                                                    if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                    }
                                                }
                                                if (context == null) {
                                                    ylVarZzc.f22293d = false;
                                                    conditionVariable = ylVarZzc.f22291b;
                                                } else {
                                                    zzba.zza();
                                                    ylVarZzc.f22294e = wl.a(context);
                                                    if (!ylVarZzc.f22298i) {
                                                        zzba.zzd().a(ylVarZzc.f22296g);
                                                    }
                                                    if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                    }
                                                    sharedPreferences2 = ylVarZzc.f22294e;
                                                    if (sharedPreferences2 != null) {
                                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                        String string2 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        ylVarZzc.f22297h = new JSONObject(string2);
                                                    }
                                                    ylVarZzc.f22292c = true;
                                                    ylVarZzc.f22293d = false;
                                                    ylVarZzc.f22291b.open();
                                                }
                                            }
                                            context = ylVarZzc.f22296g;
                                            if (context == null) {
                                                ylVarZzc.f22293d = false;
                                                conditionVariable = ylVarZzc.f22291b;
                                            } else {
                                                zzba.zza();
                                                ylVarZzc.f22294e = wl.a(context);
                                                if (!ylVarZzc.f22298i) {
                                                    zzba.zzd().a(ylVarZzc.f22296g);
                                                }
                                                if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                }
                                                sharedPreferences2 = ylVarZzc.f22294e;
                                                if (sharedPreferences2 != null) {
                                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                    String string3 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                    ylVarZzc.f22297h = new JSONObject(string3);
                                                }
                                                ylVarZzc.f22292c = true;
                                                ylVarZzc.f22293d = false;
                                                ylVarZzc.f22291b.open();
                                            }
                                        } else {
                                            pbVar = zm.f22664f;
                                            if (((Long) pbVar.o()).longValue() > 0 || x10.B(ylVarZzc.f22296g, "init_without_write") < ((Long) pbVar.o()).longValue()) {
                                                Context context3 = ylVarZzc.f22296g;
                                                if (!((Boolean) fn.f14473k.o()).booleanValue()) {
                                                    if (((Boolean) fn.l.o()).booleanValue() && (sharedPreferences = context3.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) != null) {
                                                        threadPolicy = StrictMode.getThreadPolicy();
                                                        try {
                                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                            string = sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                            StrictMode.setThreadPolicy(threadPolicy);
                                                            try {
                                                                if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                                }
                                                            } catch (JSONException unused3) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            StrictMode.setThreadPolicy(threadPolicy);
                                                            throw th2;
                                                        }
                                                    }
                                                    if (context == null) {
                                                        ylVarZzc.f22293d = false;
                                                        conditionVariable = ylVarZzc.f22291b;
                                                    } else {
                                                        zzba.zza();
                                                        ylVarZzc.f22294e = wl.a(context);
                                                        if (!ylVarZzc.f22298i && ((Boolean) fn.f14467e.o()).booleanValue()) {
                                                            zzba.zzd().a(ylVarZzc.f22296g);
                                                        }
                                                        if (!((Boolean) fn.f14465c.o()).booleanValue() && (sharedPreferences3 = ylVarZzc.f22294e) != null) {
                                                            sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                        }
                                                        sharedPreferences2 = ylVarZzc.f22294e;
                                                        if (sharedPreferences2 != null) {
                                                            try {
                                                                threadPolicy2 = StrictMode.getThreadPolicy();
                                                                try {
                                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                                    String string4 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                                    ylVarZzc.f22297h = new JSONObject(string4);
                                                                } catch (Throwable th3) {
                                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                                    throw th3;
                                                                }
                                                            } catch (JSONException unused4) {
                                                            }
                                                        }
                                                        ylVarZzc.f22292c = true;
                                                        ylVarZzc.f22293d = false;
                                                        ylVarZzc.f22291b.open();
                                                    }
                                                }
                                                context = ylVarZzc.f22296g;
                                                if (context == null) {
                                                    ylVarZzc.f22293d = false;
                                                    conditionVariable = ylVarZzc.f22291b;
                                                } else {
                                                    zzba.zza();
                                                    ylVarZzc.f22294e = wl.a(context);
                                                    if (!ylVarZzc.f22298i) {
                                                        zzba.zzd().a(ylVarZzc.f22296g);
                                                    }
                                                    if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                    }
                                                    sharedPreferences2 = ylVarZzc.f22294e;
                                                    if (sharedPreferences2 != null) {
                                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                        String string5 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        ylVarZzc.f22297h = new JSONObject(string5);
                                                    }
                                                    ylVarZzc.f22292c = true;
                                                    ylVarZzc.f22293d = false;
                                                    ylVarZzc.f22291b.open();
                                                }
                                            } else {
                                                ylVarZzc.f22299j = true;
                                                ylVarZzc.f22292c = true;
                                                ylVarZzc.f22293d = false;
                                                conditionVariable = ylVarZzc.f22291b;
                                            }
                                        }
                                        conditionVariable.open();
                                    } else if (ylVarZzc.f22298i) {
                                        pbVar = zm.f22664f;
                                        if (((Long) pbVar.o()).longValue() > 0) {
                                            Context context4 = ylVarZzc.f22296g;
                                            if (!((Boolean) fn.f14473k.o()).booleanValue()) {
                                                if (((Boolean) fn.l.o()).booleanValue()) {
                                                    threadPolicy = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                    string = sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy);
                                                    if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                    }
                                                }
                                                if (context == null) {
                                                    ylVarZzc.f22293d = false;
                                                    conditionVariable = ylVarZzc.f22291b;
                                                    conditionVariable.open();
                                                } else {
                                                    zzba.zza();
                                                    ylVarZzc.f22294e = wl.a(context);
                                                    if (!ylVarZzc.f22298i) {
                                                        zzba.zzd().a(ylVarZzc.f22296g);
                                                    }
                                                    if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                    }
                                                    sharedPreferences2 = ylVarZzc.f22294e;
                                                    if (sharedPreferences2 != null) {
                                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                        String string6 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        ylVarZzc.f22297h = new JSONObject(string6);
                                                    }
                                                    ylVarZzc.f22292c = true;
                                                    ylVarZzc.f22293d = false;
                                                    ylVarZzc.f22291b.open();
                                                }
                                            }
                                            context = ylVarZzc.f22296g;
                                            if (context == null) {
                                                ylVarZzc.f22293d = false;
                                                conditionVariable = ylVarZzc.f22291b;
                                                conditionVariable.open();
                                            } else {
                                                zzba.zza();
                                                ylVarZzc.f22294e = wl.a(context);
                                                if (!ylVarZzc.f22298i) {
                                                    zzba.zzd().a(ylVarZzc.f22296g);
                                                }
                                                if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                }
                                                sharedPreferences2 = ylVarZzc.f22294e;
                                                if (sharedPreferences2 != null) {
                                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                    String string7 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                    ylVarZzc.f22297h = new JSONObject(string7);
                                                }
                                                ylVarZzc.f22292c = true;
                                                ylVarZzc.f22293d = false;
                                                ylVarZzc.f22291b.open();
                                            }
                                        } else {
                                            Context context5 = ylVarZzc.f22296g;
                                            if (!((Boolean) fn.f14473k.o()).booleanValue()) {
                                                if (((Boolean) fn.l.o()).booleanValue()) {
                                                    threadPolicy = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                    string = sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy);
                                                    if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                    }
                                                }
                                                if (context == null) {
                                                    ylVarZzc.f22293d = false;
                                                    conditionVariable = ylVarZzc.f22291b;
                                                    conditionVariable.open();
                                                } else {
                                                    zzba.zza();
                                                    ylVarZzc.f22294e = wl.a(context);
                                                    if (!ylVarZzc.f22298i) {
                                                        zzba.zzd().a(ylVarZzc.f22296g);
                                                    }
                                                    if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                    }
                                                    sharedPreferences2 = ylVarZzc.f22294e;
                                                    if (sharedPreferences2 != null) {
                                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                        String string8 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        ylVarZzc.f22297h = new JSONObject(string8);
                                                    }
                                                    ylVarZzc.f22292c = true;
                                                    ylVarZzc.f22293d = false;
                                                    ylVarZzc.f22291b.open();
                                                }
                                            }
                                            context = ylVarZzc.f22296g;
                                            if (context == null) {
                                                ylVarZzc.f22293d = false;
                                                conditionVariable = ylVarZzc.f22291b;
                                                conditionVariable.open();
                                            } else {
                                                zzba.zza();
                                                ylVarZzc.f22294e = wl.a(context);
                                                if (!ylVarZzc.f22298i) {
                                                    zzba.zzd().a(ylVarZzc.f22296g);
                                                }
                                                if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                }
                                                sharedPreferences2 = ylVarZzc.f22294e;
                                                if (sharedPreferences2 != null) {
                                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                    String string9 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                    ylVarZzc.f22297h = new JSONObject(string9);
                                                }
                                                ylVarZzc.f22292c = true;
                                                ylVarZzc.f22293d = false;
                                                ylVarZzc.f22291b.open();
                                            }
                                        }
                                    } else {
                                        Context context6 = ylVarZzc.f22296g;
                                        if (!((Boolean) fn.f14473k.o()).booleanValue()) {
                                            if (((Boolean) fn.l.o()).booleanValue()) {
                                                threadPolicy = StrictMode.getThreadPolicy();
                                                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                string = sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                StrictMode.setThreadPolicy(threadPolicy);
                                                if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                }
                                            }
                                            if (context == null) {
                                                ylVarZzc.f22293d = false;
                                                conditionVariable = ylVarZzc.f22291b;
                                                conditionVariable.open();
                                            } else {
                                                zzba.zza();
                                                ylVarZzc.f22294e = wl.a(context);
                                                if (!ylVarZzc.f22298i) {
                                                    zzba.zzd().a(ylVarZzc.f22296g);
                                                }
                                                if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                                }
                                                sharedPreferences2 = ylVarZzc.f22294e;
                                                if (sharedPreferences2 != null) {
                                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                    String string10 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                    StrictMode.setThreadPolicy(threadPolicy2);
                                                    ylVarZzc.f22297h = new JSONObject(string10);
                                                }
                                                ylVarZzc.f22292c = true;
                                                ylVarZzc.f22293d = false;
                                                ylVarZzc.f22291b.open();
                                            }
                                        }
                                        context = ylVarZzc.f22296g;
                                        if (context == null) {
                                            ylVarZzc.f22293d = false;
                                            conditionVariable = ylVarZzc.f22291b;
                                            conditionVariable.open();
                                        } else {
                                            zzba.zza();
                                            ylVarZzc.f22294e = wl.a(context);
                                            if (!ylVarZzc.f22298i) {
                                                zzba.zzd().a(ylVarZzc.f22296g);
                                            }
                                            if (!((Boolean) fn.f14465c.o()).booleanValue()) {
                                                sharedPreferences3.registerOnSharedPreferenceChangeListener(ylVarZzc);
                                            }
                                            sharedPreferences2 = ylVarZzc.f22294e;
                                            if (sharedPreferences2 != null) {
                                                threadPolicy2 = StrictMode.getThreadPolicy();
                                                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                String string11 = sharedPreferences2.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                                                StrictMode.setThreadPolicy(threadPolicy2);
                                                ylVarZzc.f22297h = new JSONObject(string11);
                                            }
                                            ylVarZzc.f22292c = true;
                                            ylVarZzc.f22293d = false;
                                            ylVarZzc.f22291b.open();
                                        }
                                    }
                                } catch (Throwable th4) {
                                    ylVarZzc.f22293d = false;
                                    ylVarZzc.f22291b.open();
                                    throw th4;
                                }
                                break;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                return null;
            default:
                int i10 = fy1.f14575z;
                Context context7 = this.f22650b;
                ya1 ya1Var = z.f22421n;
                synchronized (z.class) {
                    try {
                        if (z.f22427t == null) {
                            if (context7 != null) {
                                applicationContext2 = context7.getApplicationContext();
                            }
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            Long lValueOf = Long.valueOf(C.TIME_UNSET);
                            map.put(2, lValueOf);
                            map.put(3, lValueOf);
                            map.put(4, lValueOf);
                            map.put(5, lValueOf);
                            map.put(10, lValueOf);
                            map.put(9, lValueOf);
                            map.put(7, lValueOf);
                            z.f22427t = new z(applicationContext2, map);
                        }
                        zVar = z.f22427t;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return zVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((oa0) obj).a(this.f22650b);
    }
}
