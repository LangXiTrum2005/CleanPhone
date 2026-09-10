package androidx.fragment.app;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4245a;

    public /* synthetic */ a1(int i10) {
        this.f4245a = i10;
    }

    @Override // i.a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f4245a) {
            case 0:
                h.j jVar = (h.j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f42070b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = jVar.f42069a;
                        kotlin.jvm.internal.n.f(intentSender, "intentSender");
                        jVar = new h.j(intentSender, null, jVar.f42071c, jVar.f42072d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (g1.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                return d(context, (h.k) obj);
            case 2:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.n.f(input, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                kotlin.jvm.internal.n.e(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 3:
                Intent input2 = (Intent) obj;
                kotlin.jvm.internal.n.f(input2, "input");
                return input2;
            default:
                h.j input3 = (h.j) obj;
                kotlin.jvm.internal.n.f(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input3);
                kotlin.jvm.internal.n.e(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
        }
    }

    @Override // i.a
    public n5.f b(Context context, Object obj) {
        switch (this.f4245a) {
            case 1:
                kotlin.jvm.internal.n.f((h.k) obj, "input");
                return null;
            case 2:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.n.f(input, "input");
                if (input.length == 0) {
                    return new n5.f(xj.w.f53867a, 16);
                }
                for (String str : input) {
                    if (b0.b.a(context, str) != 0) {
                        return null;
                    }
                }
                int iO = xj.b0.O(input.length);
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new n5.f(linkedHashMap, 16);
            default:
                return super.b(context, obj);
        }
    }

    @Override // i.a
    public final Object c(Intent intent, int i10) {
        List arrayList;
        switch (this.f4245a) {
            case 0:
                return new h.a(intent, i10);
            case 1:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = xj.v.f53866a;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i11 = 0; i11 < itemCount; i11++) {
                            Uri uri = clipData.getItemAt(i11).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) xj.n.q0(arrayList);
            case 2:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i12 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i12 == 0));
                        }
                        return xj.b0.W(xj.n.U0(xj.k.m0(stringArrayExtra), arrayList2));
                    }
                }
                return xj.w.f53867a;
            case 3:
                return new h.a(intent, i10);
            default:
                return new h.a(intent, i10);
        }
    }

    public Intent d(Context context, h.k input) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(input, "input");
        if (Build.VERSION.SDK_INT >= 33 || SdkExtensions.getExtensionVersion(30) >= 2) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(x7.a.C(input.f42073a));
            input.f42075c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (x7.a.B(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(x7.a.C(input.f42073a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoB = x7.a.B(context);
        if (resolveInfoB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoB.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(x7.a.C(input.f42073a));
        input.f42075c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }
}
