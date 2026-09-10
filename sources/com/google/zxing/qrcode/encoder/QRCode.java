package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: loaded from: classes3.dex */
public final class QRCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f21418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f21419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Version f21420c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteMatrix f21421e;

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.f21418a);
        sb.append("\n ecLevel: ");
        sb.append(this.f21419b);
        sb.append("\n version: ");
        sb.append(this.f21420c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.f21421e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f21421e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
