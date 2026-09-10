package com.thinkup.core.api;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public interface TUGDPRConsentDismissListener {

    public static class ConsentDismissInfo {
        private int dismissType;
        private String infoMsg;

        public ConsentDismissInfo(String str, int i2) {
            this.infoMsg = str;
            this.dismissType = i2;
        }

        public int getDismissType() {
            return this.dismissType;
        }

        public String getInfoMsg() {
            return this.infoMsg;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConsentDismissInfo{infoMsg='");
            sb.append(this.infoMsg);
            sb.append("', dismissType=");
            return a.p(sb, this.dismissType, AbstractJsonLexerKt.END_OBJ);
        }
    }

    void onDismiss(ConsentDismissInfo consentDismissInfo);
}
