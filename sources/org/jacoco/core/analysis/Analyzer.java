package org.jacoco.core.analysis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jacoco.core.JaCoCo;
import org.jacoco.core.data.ExecutionData;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.internal.ContentTypeDetector;
import org.jacoco.core.internal.InputStreams;
import org.jacoco.core.internal.Pack200Streams;
import org.jacoco.core.internal.analysis.ClassAnalyzer;
import org.jacoco.core.internal.analysis.ClassCoverageImpl;
import org.jacoco.core.internal.analysis.StringPool;
import org.jacoco.core.internal.data.CRC64;
import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class Analyzer {
    private final ICoverageVisitor coverageVisitor;
    private final ExecutionDataStore executionData;
    private final StringPool stringPool = new StringPool();

    public Analyzer(ExecutionDataStore executionDataStore, ICoverageVisitor iCoverageVisitor) {
        this.executionData = executionDataStore;
        this.coverageVisitor = iCoverageVisitor;
    }

    private void analyzeClass(byte[] bArr) {
        long jClassId = CRC64.classId(bArr);
        ClassReader classReaderClassReaderFor = InstrSupport.classReaderFor(bArr);
        if ((classReaderClassReaderFor.getAccess() & 32768) == 0 && (classReaderClassReaderFor.getAccess() & 4096) == 0) {
            classReaderClassReaderFor.accept(createAnalyzingVisitor(jClassId, classReaderClassReaderFor.getClassName()), 0);
        }
    }

    private int analyzeGzip(InputStream inputStream, String str) throws IOException {
        try {
            return analyzeAll(new GZIPInputStream(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzePack200(InputStream inputStream, String str) throws IOException {
        try {
            return analyzeAll(Pack200Streams.unpack(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzeZip(InputStream inputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int iAnalyzeAll = 0;
        while (true) {
            ZipEntry zipEntryNextEntry = nextEntry(zipInputStream, str);
            if (zipEntryNextEntry == null) {
                return iAnalyzeAll;
            }
            iAnalyzeAll += analyzeAll(zipInputStream, str + "@" + zipEntryNextEntry.getName());
        }
    }

    private IOException analyzerError(String str, Exception exc) {
        IOException iOException = new IOException(String.format("Error while analyzing %s with JaCoCo %s/%s.", str, JaCoCo.VERSION, JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    private ClassVisitor createAnalyzingVisitor(long j, String str) {
        boolean[] probes;
        boolean zContains;
        ExecutionData executionData = this.executionData.get(j);
        if (executionData == null) {
            zContains = this.executionData.contains(str);
            probes = null;
        } else {
            probes = executionData.getProbes();
            zContains = false;
        }
        boolean[] zArr = probes;
        final ClassCoverageImpl classCoverageImpl = new ClassCoverageImpl(str, j, zContains);
        return new ClassProbesAdapter(new ClassAnalyzer(classCoverageImpl, zArr, this.stringPool) { // from class: org.jacoco.core.analysis.Analyzer.1
            @Override // org.objectweb.asm.ClassVisitor
            public void visitEnd() {
                super.visitEnd();
                Analyzer.this.coverageVisitor.visitCoverage(classCoverageImpl);
            }
        }, false);
    }

    private ZipEntry nextEntry(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(InputStream inputStream, String str) throws IOException {
        try {
            ContentTypeDetector contentTypeDetector = new ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                analyzeClass(contentTypeDetector.getInputStream(), str);
                return 1;
            }
            if (type == -889270259) {
                return analyzePack200(contentTypeDetector.getInputStream(), str);
            }
            if (type == 529203200) {
                return analyzeGzip(contentTypeDetector.getInputStream(), str);
            }
            if (type != 1347093252) {
                return 0;
            }
            return analyzeZip(contentTypeDetector.getInputStream(), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public void analyzeClass(byte[] bArr, String str) throws IOException {
        try {
            analyzeClass(bArr);
        } catch (RuntimeException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(File file) throws IOException {
        if (file.isDirectory()) {
            int iAnalyzeAll = 0;
            for (File file2 : file.listFiles()) {
                iAnalyzeAll += analyzeAll(file2);
            }
            return iAnalyzeAll;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return analyzeAll(fileInputStream, file.getPath());
        } finally {
            fileInputStream.close();
        }
    }

    public void analyzeClass(InputStream inputStream, String str) throws IOException {
        try {
            analyzeClass(InputStreams.readFully(inputStream), str);
        } catch (IOException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(String str, File file) throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
        int iAnalyzeAll = 0;
        while (stringTokenizer.hasMoreTokens()) {
            iAnalyzeAll += analyzeAll(new File(file, stringTokenizer.nextToken()));
        }
        return iAnalyzeAll;
    }
}
