package sakeen;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SpannableBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan extends SpannableStringBuilder {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final List<attabal> f37041arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Class<?> f37042kowloon;

    /* JADX INFO: compiled from: SpannableBuilder.java */
    public static class attabal implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final AtomicInteger f37043arytenoidectomy = new AtomicInteger(0);

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Object f37044kowloon;

        public attabal(Object obj) {
            this.f37044kowloon = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f37044kowloon).afterTextChanged(editable);
        }

        public final void attabal() {
            this.f37043arytenoidectomy.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f37044kowloon).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void dern() {
            this.f37043arytenoidectomy.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f37043arytenoidectomy.get() <= 0 || !saneness(obj)) {
                ((SpanWatcher) this.f37044kowloon).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f37043arytenoidectomy.get() <= 0 || !saneness(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    } else {
                        i5 = i;
                        i6 = i3;
                    }
                }
                ((SpanWatcher) this.f37044kowloon).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f37043arytenoidectomy.get() <= 0 || !saneness(obj)) {
                ((SpanWatcher) this.f37044kowloon).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f37044kowloon).onTextChanged(charSequence, i, i2, i3);
        }

        public final boolean saneness(Object obj) {
            return obj instanceof beachfront;
        }
    }

    public taiyuan(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f37041arytenoidectomy = new ArrayList();
        technofreak.cutely.impromptu(cls, "watcherClass cannot be null");
        this.f37042kowloon = cls;
    }

    public static taiyuan dern(Class<?> cls, CharSequence charSequence) {
        return new taiyuan(cls, charSequence);
    }

    public void attabal() {
        saneness();
    }

    public final attabal beachfront(Object obj) {
        for (int i = 0; i < this.f37041arytenoidectomy.size(); i++) {
            attabal attabalVar = this.f37041arytenoidectomy.get(i);
            if (attabalVar.f37044kowloon == obj) {
                return attabalVar;
            }
        }
        return null;
    }

    public final boolean competently(Class<?> cls) {
        return this.f37042kowloon == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        attabal attabalVarBeachfront;
        if (impromptu(obj) && (attabalVarBeachfront = beachfront(obj)) != null) {
            obj = attabalVarBeachfront;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        attabal attabalVarBeachfront;
        if (impromptu(obj) && (attabalVarBeachfront = beachfront(obj)) != null) {
            obj = attabalVarBeachfront;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        attabal attabalVarBeachfront;
        if (impromptu(obj) && (attabalVarBeachfront = beachfront(obj)) != null) {
            obj = attabalVarBeachfront;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!competently(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        attabal[] attabalVarArr = (attabal[]) super.getSpans(i, i2, attabal.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, attabalVarArr.length));
        for (int i3 = 0; i3 < attabalVarArr.length; i3++) {
            tArr[i3] = attabalVarArr[i3].f37044kowloon;
        }
        return tArr;
    }

    public final boolean impromptu(Object obj) {
        return obj != null && competently(obj.getClass());
    }

    public final void marial() {
        for (int i = 0; i < this.f37041arytenoidectomy.size(); i++) {
            this.f37041arytenoidectomy.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || competently(cls)) {
            cls = attabal.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        attabal attabalVarBeachfront;
        if (impromptu(obj)) {
            attabalVarBeachfront = beachfront(obj);
            if (attabalVarBeachfront != null) {
                obj = attabalVarBeachfront;
            }
        } else {
            attabalVarBeachfront = null;
        }
        super.removeSpan(obj);
        if (attabalVarBeachfront != null) {
            this.f37041arytenoidectomy.remove(attabalVarBeachfront);
        }
    }

    public final void saneness() {
        for (int i = 0; i < this.f37041arytenoidectomy.size(); i++) {
            this.f37041arytenoidectomy.get(i).attabal();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (impromptu(obj)) {
            attabal attabalVar = new attabal(obj);
            this.f37041arytenoidectomy.add(attabalVar);
            obj = attabalVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new taiyuan(this.f37042kowloon, this, i, i2);
    }

    public final void taiyuan() {
        for (int i = 0; i < this.f37041arytenoidectomy.size(); i++) {
            this.f37041arytenoidectomy.get(i).dern();
        }
    }

    public void wireman() {
        taiyuan();
        marial();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        saneness();
        super.replace(i, i2, charSequence);
        taiyuan();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public taiyuan(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f37041arytenoidectomy = new ArrayList();
        technofreak.cutely.impromptu(cls, "watcherClass cannot be null");
        this.f37042kowloon = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        saneness();
        super.replace(i, i2, charSequence, i3, i4);
        taiyuan();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
