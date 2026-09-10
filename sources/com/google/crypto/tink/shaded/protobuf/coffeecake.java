package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class coffeecake {

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public class attabal implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ ByteString f22177attabal;

        public attabal(ByteString byteString) {
            this.f22177attabal = byteString;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.coffeecake.saneness
        public byte byteAt(int i) {
            return this.f22177attabal.byteAt(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.coffeecake.saneness
        public int size() {
            return this.f22177attabal.size();
        }
    }

    /* JADX INFO: compiled from: TextFormatEscaper.java */
    public interface saneness {
        byte byteAt(int i);

        int size();
    }

    public static String attabal(ByteString byteString) {
        return saneness(new attabal(byteString));
    }

    public static String dern(String str) {
        return attabal(ByteString.copyFromUtf8(str));
    }

    public static String saneness(saneness sanenessVar) {
        StringBuilder sb = new StringBuilder(sanenessVar.size());
        for (int i = 0; i < sanenessVar.size(); i++) {
            byte bByteAt = sanenessVar.byteAt(i);
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
}
