package androidx.constraintlayout.core.parser;

import nosophobia.attabal;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, attabal attabalVar) {
        super(str);
        this.mReason = str;
        this.mElementClass = "unknown";
        this.mLineNumber = 0;
    }

    public String reason() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
