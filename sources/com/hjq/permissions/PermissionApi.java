package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class PermissionApi {

    @NonNull
    private static final PermissionDelegate DELEGATE;

    static {
        if (AndroidVersion.isAndroid13()) {
            DELEGATE = new PermissionDelegateImplV33();
            return;
        }
        if (AndroidVersion.isAndroid12()) {
            DELEGATE = new PermissionDelegateImplV31();
            return;
        }
        if (AndroidVersion.isAndroid11()) {
            DELEGATE = new PermissionDelegateImplV30();
            return;
        }
        if (AndroidVersion.isAndroid10()) {
            DELEGATE = new PermissionDelegateImplV29();
            return;
        }
        if (AndroidVersion.isAndroid9()) {
            DELEGATE = new PermissionDelegateImplV28();
            return;
        }
        if (AndroidVersion.isAndroid8()) {
            DELEGATE = new PermissionDelegateImplV26();
            return;
        }
        if (AndroidVersion.isAndroid6()) {
            DELEGATE = new PermissionDelegateImplV23();
            return;
        }
        if (AndroidVersion.isAndroid5()) {
            DELEGATE = new PermissionDelegateImplV21();
            return;
        }
        if (AndroidVersion.isAndroid4_4()) {
            DELEGATE = new PermissionDelegateImplV19();
        } else if (AndroidVersion.isAndroid4_3()) {
            DELEGATE = new PermissionDelegateImplV18();
        } else {
            DELEGATE = new PermissionDelegateImplV14();
        }
    }

    public static boolean containsSpecialPermission(List<String> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (isSpecialPermission(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> getDeniedPermissions(@NonNull Context context, @NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (!isGrantedPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<String> getGrantedPermissions(@NonNull Context context, @NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (isGrantedPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static Intent getPermissionIntent(@NonNull Context context, @NonNull String str) {
        return DELEGATE.getPermissionIntent(context, str);
    }

    public static boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        return DELEGATE.isGrantedPermission(context, str);
    }

    public static boolean isGrantedPermissions(@NonNull Context context, @NonNull List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!isGrantedPermission(context, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        return DELEGATE.isPermissionPermanentDenied(activity, str);
    }

    public static boolean isSpecialPermission(@NonNull String str) {
        return PermissionUtils.isSpecialPermission(str);
    }

    public static boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (isPermissionPermanentDenied(activity, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getDeniedPermissions(@NonNull List<String> list, @NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static List<String> getGrantedPermissions(@NonNull List<String> list, @NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }
}
