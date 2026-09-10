package com.google.protobuf;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class creditor {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public class attabal implements dern {
        final /* synthetic */ ByteString val$input;

        public attabal(ByteString byteString) {
            this.val$input = byteString;
        }

        @Override // com.google.protobuf.creditor.dern
        public byte byteAt(int i) {
            return this.val$input.byteAt(i);
        }

        @Override // com.google.protobuf.creditor.dern
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public interface dern {
        byte byteAt(int i);

        int size();
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public class saneness implements dern {
        final /* synthetic */ byte[] val$input;

        public saneness(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.creditor.dern
        public byte byteAt(int i) {
            return this.val$input[i];
        }

        @Override // com.google.protobuf.creditor.dern
        public int size() {
            return this.val$input.length;
        }
    }

    private creditor() {
    }

    public static String escapeBytes(dern dernVar) {
        StringBuilder sb = new StringBuilder(dernVar.size());
        for (int i = 0; i < dernVar.size(); i++) {
            byte bByteAt = dernVar.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeBytes(ByteString byteString) {
        return escapeBytes(new attabal(byteString));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new saneness(bArr));
    }
}
