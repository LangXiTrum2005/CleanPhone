package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f20848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20849d;

    public /* synthetic */ up0(Object obj, Parcelable parcelable, Object obj2, int i10) {
        this.f20846a = i10;
        this.f20847b = obj;
        this.f20848c = parcelable;
        this.f20849d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        JSONArray jSONArrayOptJSONArray;
        String str;
        switch (this.f20846a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) jn.f16120a.o()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    zzt.zzc();
                    String className = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f20847b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                            className = componentName.getClassName();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", className);
                    Bundle bundle3 = new Bundle();
                    zzr zzrVar = (zzr) this.f20848c;
                    bundle3.putInt("width", zzrVar.zze);
                    bundle3.putInt("height", zzrVar.zzb);
                    bundle2.putBundle("size", bundle3);
                    ArrayList arrayList = (ArrayList) this.f20849d;
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                }
                break;
            default:
                ou0 ou0Var = (ou0) this.f20847b;
                ArrayList<String> arrayList2 = ou0Var.f18367h;
                Bundle bundle4 = (Bundle) obj;
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        bundle4.putInt("native_version", 0);
                        break;
                    } else {
                        bundle4.putInt("native_version", 3);
                        bundle4.putStringArrayList("native_templates", arrayList2);
                        bundle4.putStringArrayList("native_custom_templates", ou0Var.f18368i);
                        eo eoVar = ou0Var.f18369j;
                        if (eoVar != null) {
                            String str2 = "any";
                            if (eoVar.f14030a > 3) {
                                bundle4.putBoolean("enable_native_media_orientation", true);
                                int i10 = eoVar.f14037h;
                                if (i10 == 1) {
                                    str = "any";
                                } else if (i10 == 2) {
                                    str = X3.i.C;
                                } else if (i10 != 3) {
                                    str = i10 != 4 ? "unknown" : "square";
                                } else {
                                    str = X3.i.D;
                                }
                                if (!"unknown".equals(str)) {
                                    bundle4.putString("native_media_orientation", str);
                                }
                            }
                            int i11 = eoVar.f14032c;
                            if (i11 != 0) {
                                str2 = i11 != 1 ? i11 != 2 ? "unknown" : X3.i.C : X3.i.D;
                            }
                            if (!"unknown".equals(str2)) {
                                bundle4.putString("native_image_orientation", str2);
                            }
                            bundle4.putBoolean("native_multiple_images", eoVar.f14033d);
                            bundle4.putBoolean("use_custom_mute", eoVar.f14036g);
                            int i12 = eoVar.f14038i;
                            if (i12 != 0) {
                                bundle4.putBoolean("sccg_tap", eoVar.f14039j);
                                bundle4.putInt("sccg_dir", i12);
                            }
                        }
                        PackageInfo packageInfo = (PackageInfo) this.f20848c;
                        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
                        zzg zzgVar = (zzg) this.f20849d;
                        if (i13 > zzgVar.zzg()) {
                            zzgVar.zzt();
                            zzgVar.zzf(i13);
                        }
                        JSONObject jSONObjectZzs = zzgVar.zzs();
                        String string = null;
                        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(ou0Var.f18366g)) != null) {
                            string = jSONArrayOptJSONArray.toString();
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle4.putString("native_advanced_settings", string);
                        }
                        int i14 = ou0Var.l;
                        if (i14 > 1) {
                            bundle4.putInt("max_num_ads", i14);
                        }
                        bs bsVar = ou0Var.f18361b;
                        if (bsVar != null) {
                            String str3 = bsVar.f12873c;
                            if (TextUtils.isEmpty(str3)) {
                                int i15 = bsVar.f12871a;
                                String str4 = TtmlNode.TAG_P;
                                if (i15 >= 2) {
                                    int i16 = bsVar.f12874d;
                                    if (i16 == 2 || i16 != 3) {
                                        str4 = "l";
                                    }
                                } else {
                                    int i17 = bsVar.f12872b;
                                    if (i17 == 1) {
                                        str4 = "l";
                                    } else if (i17 != 2) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i17).length() + 41);
                                        sb2.append("Instream ad video aspect ratio ");
                                        sb2.append(i17);
                                        sb2.append(" is wrong.");
                                        zzo.zzf(sb2.toString());
                                        str4 = "l";
                                    }
                                }
                                bundle4.putString("ia_var", str4);
                            } else {
                                bundle4.putString("ad_tag", str3);
                            }
                            bundle4.putBoolean("instr", true);
                        }
                        if (((Boolean) zzba.zzc().a(am.Ad)).booleanValue() && eoVar != null) {
                            zzfw zzfwVar = eoVar.f14035f;
                            if (zzfwVar != null) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putBoolean("startMuted", zzfwVar.zza);
                                bundle5.putBoolean("clickToExpandRequested", zzfwVar.zzc);
                                bundle5.putBoolean("customControlsRequested", zzfwVar.zzb);
                                bundle4.putBundle("video", bundle5);
                            }
                            bundle4.putBoolean("disable_image_loading", eoVar.f14031b);
                            bundle4.putInt("preferred_ad_choices_position", eoVar.f14034e);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
