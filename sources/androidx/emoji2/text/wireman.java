package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Set;
import sakeen.cutely;
import sakeen.formularize;
import sakeen.taiyuan;

/* JADX INFO: compiled from: EmojiProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.emoji2.text.dern.cutely f10024attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public androidx.emoji2.text.dern.marial f10025dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int[] f10026marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final beachfront f10027saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f10028wireman;

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static final class attabal {
        public static int attabal(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int saneness(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public interface dern<T> {
        boolean attabal(CharSequence charSequence, int i, int i2, cutely cutelyVar);

        T saneness();
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f10029attabal = 1;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f10030beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final boolean f10031competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public beachfront.attabal f10032dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final int[] f10033impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f10034marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final beachfront.attabal f10035saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public beachfront.attabal f10036wireman;

        public marial(beachfront.attabal attabalVar, boolean z, int[] iArr) {
            this.f10035saneness = attabalVar;
            this.f10032dern = attabalVar;
            this.f10031competently = z;
            this.f10033impromptu = iArr;
        }

        public static boolean beachfront(int i) {
            return i == 65038;
        }

        public static boolean wireman(int i) {
            return i == 65039;
        }

        public int attabal(int i) {
            beachfront.attabal attabalVarAttabal = this.f10032dern.attabal(i);
            int iCompetently = 2;
            if (this.f10029attabal != 2) {
                if (attabalVarAttabal == null) {
                    iCompetently = competently();
                } else {
                    this.f10029attabal = 2;
                    this.f10032dern = attabalVarAttabal;
                    this.f10030beachfront = 1;
                }
            } else if (attabalVarAttabal != null) {
                this.f10032dern = attabalVarAttabal;
                this.f10030beachfront++;
            } else if (beachfront(i)) {
                iCompetently = competently();
            } else if (!wireman(i)) {
                if (this.f10032dern.saneness() != null) {
                    iCompetently = 3;
                    if (this.f10030beachfront != 1 || impromptu()) {
                        this.f10036wireman = this.f10032dern;
                        competently();
                    } else {
                        iCompetently = competently();
                    }
                } else {
                    iCompetently = competently();
                }
            }
            this.f10034marial = i;
            return iCompetently;
        }

        public final int competently() {
            this.f10029attabal = 1;
            this.f10032dern = this.f10035saneness;
            this.f10030beachfront = 0;
            return 1;
        }

        public cutely dern() {
            return this.f10036wireman.saneness();
        }

        public final boolean impromptu() {
            if (this.f10032dern.saneness().cutely() || wireman(this.f10034marial)) {
                return true;
            }
            if (this.f10031competently) {
                if (this.f10033impromptu == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f10033impromptu, this.f10032dern.saneness().saneness(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean marial() {
            if (this.f10029attabal != 2 || this.f10032dern.saneness() == null) {
                return false;
            }
            return this.f10030beachfront > 1 || impromptu();
        }

        public cutely saneness() {
            return this.f10032dern.saneness();
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class saneness implements dern<formularize> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public formularize f10037attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final androidx.emoji2.text.dern.cutely f10038saneness;

        public saneness(formularize formularizeVar, androidx.emoji2.text.dern.cutely cutelyVar) {
            this.f10037attabal = formularizeVar;
            this.f10038saneness = cutelyVar;
        }

        @Override // androidx.emoji2.text.wireman.dern
        public boolean attabal(CharSequence charSequence, int i, int i2, cutely cutelyVar) {
            if (cutelyVar.apical()) {
                return true;
            }
            if (this.f10037attabal == null) {
                this.f10037attabal = new formularize(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f10037attabal.setSpan(this.f10038saneness.attabal(cutelyVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.wireman.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public formularize saneness() {
            return this.f10037attabal;
        }
    }

    public wireman(beachfront beachfrontVar, androidx.emoji2.text.dern.cutely cutelyVar, androidx.emoji2.text.dern.marial marialVar, boolean z, int[] iArr, Set<int[]> set) {
        this.f10024attabal = cutelyVar;
        this.f10027saneness = beachfrontVar;
        this.f10025dern = marialVar;
        this.f10028wireman = z;
        this.f10026marial = iArr;
        competently(set);
    }

    public static boolean attabal(Editable editable, KeyEvent keyEvent, boolean z) {
        sakeen.beachfront[] beachfrontVarArr;
        if (beachfront(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!marial(selectionStart, selectionEnd) && (beachfrontVarArr = (sakeen.beachfront[]) editable.getSpans(selectionStart, selectionEnd, sakeen.beachfront.class)) != null && beachfrontVarArr.length > 0) {
            for (sakeen.beachfront beachfrontVar : beachfrontVarArr) {
                int spanStart = editable.getSpanStart(beachfrontVar);
                int spanEnd = editable.getSpanEnd(beachfrontVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean beachfront(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean dern(Editable editable, int i, KeyEvent keyEvent) {
        boolean zAttabal;
        if (i != 67) {
            zAttabal = i != 112 ? false : attabal(editable, keyEvent, true);
        } else {
            zAttabal = attabal(editable, keyEvent, false);
        }
        if (!zAttabal) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean marial(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean saneness(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (marial(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = attabal.attabal(editable, selectionStart, Math.max(i, 0));
                iMin = attabal.saneness(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            sakeen.beachfront[] beachfrontVarArr = (sakeen.beachfront[]) editable.getSpans(iMax, iMin, sakeen.beachfront.class);
            if (beachfrontVarArr != null && beachfrontVarArr.length > 0) {
                for (sakeen.beachfront beachfrontVar : beachfrontVarArr) {
                    int spanStart = editable.getSpanStart(beachfrontVar);
                    int spanEnd = editable.getSpanEnd(beachfrontVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public final void competently(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            taiyuan(str, 0, str.length(), 1, true, new C0072wireman(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public CharSequence impromptu(CharSequence charSequence, int i, int i2, int i3, boolean z) throws Throwable {
        formularize formularizeVar;
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        taiyuan taiyuanVar;
        sakeen.beachfront[] beachfrontVarArr;
        int i6;
        int spanStart;
        boolean z2 = charSequence instanceof taiyuan;
        if (z2) {
            ((taiyuan) charSequence).attabal();
        }
        if (z2) {
            formularizeVar = new formularize((Spannable) charSequence);
            if (formularizeVar != null) {
                for (sakeen.beachfront beachfrontVar : beachfrontVarArr) {
                    spanStart = formularizeVar.getSpanStart(beachfrontVar);
                    int spanEnd = formularizeVar.getSpanEnd(beachfrontVar);
                    if (spanStart != i2) {
                        formularizeVar.removeSpan(beachfrontVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                taiyuanVar = (taiyuan) charSequence2;
                taiyuanVar.wireman();
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                taiyuanVar = (taiyuan) charSequence2;
                taiyuanVar.wireman();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    formularizeVar = new formularize((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((taiyuan) charSequence2).wireman();
                    throw th;
                }
            } else {
                formularizeVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, sakeen.beachfront.class) > i2) ? null : new formularize(charSequence);
            }
            if (formularizeVar != null && (beachfrontVarArr = (sakeen.beachfront[]) formularizeVar.getSpans(i, i2, sakeen.beachfront.class)) != null && beachfrontVarArr.length > 0) {
                while (i6 < r5) {
                    spanStart = formularizeVar.getSpanStart(beachfrontVar);
                    int spanEnd2 = formularizeVar.getSpanEnd(beachfrontVar);
                    if (spanStart != i2) {
                        formularizeVar.removeSpan(beachfrontVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5 && i4 < charSequence.length()) {
                if (i3 != Integer.MAX_VALUE && formularizeVar != null) {
                    i3 -= ((sakeen.beachfront[]) formularizeVar.getSpans(0, formularizeVar.length(), sakeen.beachfront.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    formularize formularizeVar2 = (formularize) taiyuan(charSequence2, i4, i5, i3, z, new saneness(formularizeVar, this.f10024attabal));
                    if (formularizeVar2 == null) {
                        if (z2) {
                            taiyuanVar = (taiyuan) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableSaneness = formularizeVar2.saneness();
                    if (z2) {
                        ((taiyuan) charSequence2).wireman();
                    }
                    return spannableSaneness;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((taiyuan) charSequence2).wireman();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z2) {
                return charSequence2;
            }
            taiyuanVar = (taiyuan) charSequence2;
            taiyuanVar.wireman();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((taiyuan) charSequence2).wireman();
        throw th;
    }

    public final <T> T taiyuan(CharSequence charSequence, int i, int i2, int i3, boolean z, dern<T> dernVar) {
        int iCharCount;
        marial marialVar = new marial(this.f10027saneness.beachfront(), this.f10028wireman, this.f10026marial);
        int i4 = 0;
        boolean zAttabal = true;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            iCharCount = i;
            while (true) {
                if (i >= i2 || i4 >= i3 || !zAttabal) {
                    break loop0;
                }
                int iAttabal = marialVar.attabal(iCodePointAt);
                if (iAttabal == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i = iCharCount;
                } else if (iAttabal == 2) {
                    i += Character.charCount(iCodePointAt);
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (iAttabal != 3) {
                }
            }
            if (z || !wireman(charSequence, iCharCount, i, marialVar.dern())) {
                zAttabal = dernVar.attabal(charSequence, iCharCount, i, marialVar.dern());
                i4++;
            }
        }
        if (marialVar.marial() && i4 < i3 && zAttabal && (z || !wireman(charSequence, iCharCount, i, marialVar.saneness()))) {
            dernVar.attabal(charSequence, iCharCount, i, marialVar.saneness());
        }
        return dernVar.saneness();
    }

    public final boolean wireman(CharSequence charSequence, int i, int i2, cutely cutelyVar) {
        if (cutelyVar.wireman() == 0) {
            cutelyVar.impassible(this.f10025dern.attabal(charSequence, i, i2, cutelyVar.impromptu()));
        }
        return cutelyVar.wireman() == 2;
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class C0072wireman implements dern<C0072wireman> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f10039attabal;

        public C0072wireman(String str) {
            this.f10039attabal = str;
        }

        @Override // androidx.emoji2.text.wireman.dern
        public boolean attabal(CharSequence charSequence, int i, int i2, cutely cutelyVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f10039attabal)) {
                return true;
            }
            cutelyVar.formularize(true);
            return false;
        }

        @Override // androidx.emoji2.text.wireman.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public C0072wireman saneness() {
            return this;
        }
    }
}
