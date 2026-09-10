package polliwog;

import androidx.media3.common.ParserException;
import cybernatic.monoploid;
import java.io.IOException;

/* JADX INFO: compiled from: EbmlProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public interface saneness {
    void attabal(int i, int i2, monoploid monoploidVar) throws IOException;

    void endMasterElement(int i) throws ParserException;

    void floatElement(int i, double d) throws ParserException;

    int getElementType(int i);

    void integerElement(int i, long j) throws ParserException;

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2) throws ParserException;

    void stringElement(int i, String str) throws ParserException;
}
