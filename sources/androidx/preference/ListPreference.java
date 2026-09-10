package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import v1.j;
import y3.a;
import y3.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence[] f4666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4667i;

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f54197d, i10, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f4666h = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (j.f52331c == null) {
                j.f52331c = new j(12);
            }
            this.f4674g = j.f52331c;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f54199f, i10, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f4667i = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f4674g;
        if (aVar != null) {
            return aVar.a(this);
        }
        CharSequence charSequenceA = super.a();
        String str = this.f4667i;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceA)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceA;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, e0.b.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
