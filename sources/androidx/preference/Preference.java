package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import y3.a;
import y3.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f4670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f4671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f4674g;

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this.f4669b = Integer.MAX_VALUE;
        this.f4668a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f54199f, i10, 0);
        typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f4672e = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f4670c = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f4671d = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f4669b = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (typedArrayObtainStyledAttributes.getString(22) == null) {
            typedArrayObtainStyledAttributes.getString(13);
        }
        typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.getString(19) == null) {
            typedArrayObtainStyledAttributes.getString(10);
        }
        typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z10));
        typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z10));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f4673f = c(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f4673f = c(typedArrayObtainStyledAttributes, 11);
        }
        typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        a aVar = this.f4674g;
        return aVar != null ? aVar.a(this) : this.f4671d;
    }

    public Object c(TypedArray typedArray, int i10) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = preference2.f4669b;
        CharSequence charSequence = preference2.f4670c;
        int i11 = this.f4669b;
        if (i11 != i10) {
            return i11 - i10;
        }
        CharSequence charSequence2 = this.f4670c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f4670c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb2.append(charSequenceA);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public void b() {
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, e0.b.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
