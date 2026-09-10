package com.bytedance.sdk.openadsdk.multipro.ZU;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements com.bytedance.sdk.openadsdk.multipro.Lxb {
    private Context Lxb;

    private Context LD() {
        Context context = this.Lxb;
        return context == null ? kqm.Lxb() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    @NonNull
    public String Lxb() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Cursor Lxb(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> mapLk;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapLk = LD.lk(LD(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapLk.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapLk.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = TypedValues.Custom.S_BOOLEAN;
            } else if (obj instanceof String) {
                objArr[1] = TypedValues.Custom.S_STRING;
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = TypedValues.Custom.S_FLOAT;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(LD.Lxb(kqm.Lxb(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return LD.Lxb(LD(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Uri Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj != null) {
            LD.Lxb(LD(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            LD.LD(LD(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (LD.Lxb(LD(), uri.getQueryParameter("sp_file_name"), str2)) {
            LD.LD(LD(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        Lxb(uri, contentValues);
        return 0;
    }
}
