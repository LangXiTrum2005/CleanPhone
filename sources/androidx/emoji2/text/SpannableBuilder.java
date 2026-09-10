package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableBuilder extends SpannableStringBuilder {
    public final Class X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f5000Y;

    public static class WatcherWrapper implements TextWatcher, SpanWatcher {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final AtomicInteger f5001Y = new AtomicInteger(0);

        public WatcherWrapper(Object obj) {
            this.X = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.X).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.X).beforeTextChanged(charSequence, i2, i3, i4);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f5001Y.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.X).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
  0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            int i6;
            int i7;
            if (this.f5001Y.get() <= 0 || !(obj instanceof EmojiSpan)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i6 = i2;
                    i7 = i4;
                } else {
                    if (i2 > i3) {
                        i2 = 0;
                    }
                    if (i4 > i5) {
                        i6 = i2;
                        i7 = 0;
                    } else {
                        i6 = i2;
                        i7 = i4;
                    }
                }
                ((SpanWatcher) this.X).onSpanChanged(spannable, obj, i6, i3, i7, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f5001Y.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.X).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.X).onTextChanged(charSequence, i2, i3, i4);
        }
    }

    public SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f5000Y = new ArrayList();
        Preconditions.d(cls, "watcherClass cannot be null");
        this.X = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5000Y;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i2)).f5001Y.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5000Y;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    public final WatcherWrapper c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5000Y;
            if (i2 >= arrayList.size()) {
                return null;
            }
            WatcherWrapper watcherWrapper = (WatcherWrapper) arrayList.get(i2);
            if (watcherWrapper.X == obj) {
                return watcherWrapper;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.X == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5000Y;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i2)).f5001Y.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        WatcherWrapper watcherWrapperC;
        if (d(obj) && (watcherWrapperC = c(obj)) != null) {
            obj = watcherWrapperC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        WatcherWrapper watcherWrapperC;
        if (d(obj) && (watcherWrapperC = c(obj)) != null) {
            obj = watcherWrapperC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        WatcherWrapper watcherWrapperC;
        if (d(obj) && (watcherWrapperC = c(obj)) != null) {
            obj = watcherWrapperC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.X != cls) {
            return super.getSpans(i2, i3, cls);
        }
        WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i2, i3, WatcherWrapper.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length);
        for (int i4 = 0; i4 < watcherWrapperArr.length; i4++) {
            objArr[i4] = watcherWrapperArr[i4].X;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.X == cls) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        WatcherWrapper watcherWrapperC;
        if (d(obj)) {
            watcherWrapperC = c(obj);
            if (watcherWrapperC != null) {
                obj = watcherWrapperC;
            }
        } else {
            watcherWrapperC = null;
        }
        super.removeSpan(obj);
        if (watcherWrapperC != null) {
            this.f5000Y.remove(watcherWrapperC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (d(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.f5000Y.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new SpannableBuilder(this.X, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public SpannableBuilder(Class cls, SpannableBuilder spannableBuilder, int i2, int i3) {
        super(spannableBuilder, i2, i3);
        this.f5000Y = new ArrayList();
        Preconditions.d(cls, "watcherClass cannot be null");
        this.X = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
