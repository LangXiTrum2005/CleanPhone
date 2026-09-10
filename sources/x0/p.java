package x0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.play_billing.q1;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f53540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53541b;

    public p(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f53541b = new ArrayList();
        q1.e(cls, "watcherClass cannot be null");
        this.f53540a = cls;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53541b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i10)).f53539b.incrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53541b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    public final o c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53541b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            o oVar = (o) arrayList.get(i10);
            if (oVar.f53538a == obj) {
                return oVar;
            }
            i10++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f53540a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53541b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i10)).f53539b.decrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.f53540a != cls) {
            return super.getSpans(i10, i11, cls);
        }
        o[] oVarArr = (o[]) super.getSpans(i10, i11, o.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, oVarArr.length);
        for (int i12 = 0; i12 < oVarArr.length; i12++) {
            objArr[i12] = oVarArr[i12].f53538a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f53540a == cls) {
            cls = o.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        o oVarC;
        if (d(obj)) {
            oVarC = c(obj);
            if (oVarC != null) {
                obj = oVarC;
            }
        } else {
            oVarC = null;
        }
        super.removeSpan(obj);
        if (oVarC != null) {
            this.f53541b.remove(oVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            o oVar = new o(obj);
            this.f53541b.add(oVar);
            obj = oVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new p(this.f53540a, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public p(Class cls, p pVar, int i10, int i11) {
        super(pVar, i10, i11);
        this.f53541b = new ArrayList();
        q1.e(cls, "watcherClass cannot be null");
        this.f53540a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
