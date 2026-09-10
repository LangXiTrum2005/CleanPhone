package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class TextFormatEscaper {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$1, reason: invalid class name */
    class AnonymousClass1 implements ByteSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f4927a;

        public AnonymousClass1(ByteString byteString) {
            this.f4927a = byteString;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2, reason: invalid class name */
    class AnonymousClass2 implements ByteSequence {
    }

    public interface ByteSequence {
    }

    public static String a(ByteString byteString) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(byteString);
        StringBuilder sb = new StringBuilder(byteString.size());
        int i2 = 0;
        while (true) {
            ByteString byteString2 = anonymousClass1.f4927a;
            if (i2 >= byteString2.size()) {
                return sb.toString();
            }
            byte bE = byteString2.e(i2);
            if (bE == 34) {
                sb.append("\\\"");
            } else if (bE == 39) {
                sb.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
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
                        if (bE >= 32 && bE <= 126) {
                            sb.append((char) bE);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bE >>> 6) & 3) + 48));
                            sb.append((char) (((bE >>> 3) & 7) + 48));
                            sb.append((char) ((bE & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
            i2++;
        }
    }
}
