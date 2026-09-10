package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f43107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f43108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char f43109c;
    protected n d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected n f43110e;

    /* synthetic */ n(String str, String str2, n nVar, int i2) {
        this(str, str2, nVar);
    }

    protected boolean c(char c2, char c3) {
        return c2 == c3;
    }

    private n(String str, String str2, n nVar) {
        this.f43107a = str;
        this.f43108b = str2;
        this.d = nVar;
        if (str.isEmpty()) {
            this.f43109c = (char) 65535;
        } else {
            this.f43109c = this.f43107a.charAt(0);
        }
    }

    public static n f(w wVar) {
        return wVar.k() ? new n("", null, null) : new m("", null, null);
    }

    public static n g(Set set, w wVar) {
        n nVarF = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            nVarF.b(str, str);
        }
        return nVarF;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f43107a.length() + index;
        n nVar = this.d;
        if (nVar != null && length2 != length) {
            while (!c(nVar.f43109c, charSequence.charAt(length2))) {
                nVar = nVar.f43110e;
                if (nVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strD = nVar.d(charSequence, parsePosition);
            if (strD != null) {
                return strD;
            }
        }
        parsePosition.setIndex(length2);
        return this.f43108b;
    }

    protected n e(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    protected boolean h(CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f43107a, i2);
        }
        int length = this.f43107a.length();
        if (length > i3 - i2) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int i5 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i6 = i4 + 1;
            int i7 = i2 + 1;
            if (!c(this.f43107a.charAt(i4), charSequence.charAt(i2))) {
                return false;
            }
            i2 = i7;
            length = i5;
            i4 = i6;
        }
    }

    private boolean b(String str, String str2) {
        int i2 = 0;
        while (i2 < str.length() && i2 < this.f43107a.length() && c(str.charAt(i2), this.f43107a.charAt(i2))) {
            i2++;
        }
        if (i2 == this.f43107a.length()) {
            if (i2 < str.length()) {
                String strSubstring = str.substring(i2);
                for (n nVar = this.d; nVar != null; nVar = nVar.f43110e) {
                    if (c(nVar.f43109c, strSubstring.charAt(0))) {
                        return nVar.b(strSubstring, str2);
                    }
                }
                n nVarE = e(strSubstring, str2, null);
                nVarE.f43110e = this.d;
                this.d = nVarE;
                return true;
            }
            this.f43108b = str2;
            return true;
        }
        n nVarE2 = e(this.f43107a.substring(i2), this.f43108b, this.d);
        this.f43107a = str.substring(0, i2);
        this.d = nVarE2;
        if (i2 < str.length()) {
            this.d.f43110e = e(str.substring(i2), str2, null);
            this.f43108b = null;
            return true;
        }
        this.f43108b = str2;
        return true;
    }
}
