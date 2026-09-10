package b0;

import android.app.Person;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f5074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f5076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f5077d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f5079f;

    public a0(CharSequence charSequence, long j10, o0 o0Var) {
        this.f5074a = charSequence;
        this.f5075b = j10;
        this.f5076c = o0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            o0 o0Var = a0Var.f5076c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = a0Var.f5074a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", a0Var.f5075b);
            if (o0Var != null) {
                bundle.putCharSequence("sender", o0Var.f5160a);
                bundle.putParcelable("sender_person", z.a(o0Var.c()));
            }
            String str = a0Var.f5078e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = a0Var.f5079f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = a0Var.f5077d;
            if (bundle2 != null) {
                bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        o0 o0VarA;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                a0 a0Var = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            o0VarA = o0.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person")) {
                            o0VarA = o0.a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            o0 o0Var = new o0();
                            o0Var.f5160a = charSequence;
                            o0Var.f5161b = null;
                            o0Var.f5162c = null;
                            o0Var.f5163d = null;
                            o0Var.f5164e = false;
                            o0Var.f5165f = false;
                            o0VarA = o0Var;
                        } else {
                            o0VarA = null;
                        }
                        a0 a0Var2 = new a0(bundle.getCharSequence("text"), bundle.getLong("time"), o0VarA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            a0Var2.f5078e = string;
                            a0Var2.f5079f = uri;
                        }
                        if (bundle.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                            a0Var2.f5077d.putAll(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
                        }
                        a0Var = a0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (a0Var != null) {
                    arrayList.add(a0Var);
                }
            }
        }
        return arrayList;
    }
}
