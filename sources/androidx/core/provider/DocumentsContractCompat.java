package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class DocumentsContractCompat {

    public static final class DocumentCompat {
    }

    public static class DocumentsContractApi21Impl {
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        public static Uri g(ContentResolver contentResolver, Uri uri, String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    public static class DocumentsContractApi24Impl {
        public static boolean a(Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }
}
