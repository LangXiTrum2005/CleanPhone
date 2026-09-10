package un;

import an.p;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.storage.androidcleaner.R;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.n;
import n.j;
import na.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v9.f;
import w1.m;
import w1.s;
import w1.t;
import xi.v;
import xk.d;
import xk.e;
import y7.r;
import yl.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements k, t, t8.b, xb.a, y3.a, yf.a, SuccessContinuation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f52273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f52274c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52275a;

    public /* synthetic */ a(int i10) {
        this.f52275a = i10;
    }

    public static final t1.t f(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String permission = jSONObjectOptJSONObject.optString("permission");
            n.e(permission, "permission");
            if (permission.length() != 0 && !permission.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(permission);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(permission);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(permission);
                }
            }
        }
        t1.t tVar = new t1.t();
        tVar.f50411a = arrayList;
        tVar.f50412b = arrayList2;
        tVar.f50413c = arrayList3;
        return tVar;
    }

    public static final Bundle g(String str) {
        ScheduledExecutorService scheduledExecutorService = r.f54310c;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static boolean h(z0.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                x0.r[] rVarArr = (x0.r[]) editable.getSpans(selectionStart, iMin, x0.r.class);
                if (rVarArr != null && rVarArr.length > 0) {
                    for (x0.r rVar : rVarArr) {
                        int spanStart = editable.getSpanStart(rVar);
                        int spanEnd = editable.getSpanEnd(rVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static d i(String str, c packageFqName) {
        e eVar;
        Integer numValueOf;
        n.f(packageFqName, "packageFqName");
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i11];
            if (n.a(eVar.f53893a, packageFqName) && p.p0(str, eVar.f53894b, false)) {
                break;
            }
            i11++;
        }
        if (eVar != null) {
            String strSubstring = str.substring(eVar.f53894b.length());
            n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 0) {
                numValueOf = null;
                break;
            }
            int length2 = strSubstring.length();
            int i12 = 0;
            while (true) {
                if (i10 >= length2) {
                    numValueOf = Integer.valueOf(i12);
                    break;
                }
                int iCharAt = strSubstring.charAt(i10) - '0';
                if (iCharAt < 0 || iCharAt >= 10) {
                    numValueOf = null;
                    break;
                }
                i12 = (i12 * 10) + iCharAt;
                i10++;
            }
            if (numValueOf != null) {
                return new d(eVar, numValueOf.intValue());
            }
        }
        return null;
    }

    @Override // y3.a
    public CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f4668a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        v9.c cVar = (v9.c) ((v9.b) obj).getService();
        zza zzaVar = new zza(null, null);
        f fVar = new f((TaskCompletionSource) obj2);
        cVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i10 = v9.a.f52496a;
        parcelObtain.writeInt(1);
        zzaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(fVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            cVar.f52497a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // yf.a
    public int b(int i10) {
        switch (this.f52275a) {
            case 15:
                return i10 / 2;
            default:
                return i10 * 2;
        }
    }

    @Override // w1.t
    public j2.p c(w1.p pVar, m mVar) {
        return new s(pVar, mVar);
    }

    @Override // w1.t
    public j2.p d() {
        return new s(w1.p.f52861n, null);
    }

    @Override // yf.a
    public void e(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        switch (this.f52275a) {
            case 15:
                int iMin = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
                for (int i10 = 0; i10 < iMin; i10++) {
                    int i11 = shortBuffer.get() + Short.MIN_VALUE;
                    int i12 = shortBuffer.get() + Short.MIN_VALUE;
                    int i13 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    int i14 = (i11 < 32768 || i12 < 32768) ? (i11 * i12) / 32768 : (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    if (i14 != 65536) {
                        i13 = i14;
                    }
                    shortBuffer2.put((short) (i13 - 32768));
                }
                break;
            default:
                int iMin2 = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
                for (int i15 = 0; i15 < iMin2; i15++) {
                    short s10 = shortBuffer.get();
                    shortBuffer2.put(s10);
                    shortBuffer2.put(s10);
                }
                break;
        }
    }

    @Override // vj.a
    public Object get() {
        rc.d dVar = new rc.d(1);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o8.d.f47211a, new x8.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o8.d.f47213c, new x8.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(x8.c.f53667b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(o8.d.f47212b, new x8.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < o8.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new x8.a(dVar, map);
    }

    @Override // xb.a
    public void o(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public a(j jVar) {
        this.f52275a = 4;
        new xi.p(jVar, "flutter/deferredcomponent", v.f53830b).b(new g(this, 24));
        v9.e.F().getClass();
        new HashMap();
    }
}
