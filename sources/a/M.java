package A;

import android.app.Person;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class M {
    public static /* bridge */ /* synthetic */ Person c(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder g(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText i(Object obj) {
        return (PrecomputedText) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
