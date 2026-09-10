package org.jacoco.core.internal.analysis.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.BitSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinInlineFilter implements IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final Pattern LINE_INFO_PATTERN = Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final Pattern FILE_INFO_PATTERN = Pattern.compile("\\+ ([0-9]++) (.++)");

    private static void expectLine(BufferedReader bufferedReader, String str) throws IOException {
        String line = bufferedReader.readLine();
        if (str.equals(line)) {
            return;
        }
        throw new IllegalStateException("Unexpected SMAP line: " + line);
    }

    private static int getFirstGeneratedLineNumber(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str2));
            expectLine(bufferedReader, "SMAP");
            expectLine(bufferedReader, str);
            expectLine(bufferedReader, "Kotlin");
            expectLine(bufferedReader, "*S Kotlin");
            expectLine(bufferedReader, "*F");
            BitSet bitSet = new BitSet();
            while (true) {
                String line = bufferedReader.readLine();
                if ("*L".equals(line)) {
                    if (bitSet.isEmpty()) {
                        throw new IllegalStateException("Unexpected SMAP FileSection");
                    }
                    int iMin = Integer.MAX_VALUE;
                    while (true) {
                        String line2 = bufferedReader.readLine();
                        if (line2.equals("*E") || line2.equals("*S KotlinDebug")) {
                            break;
                            break;
                        }
                        Matcher matcher = LINE_INFO_PATTERN.matcher(line2);
                        if (!matcher.matches()) {
                            throw new IllegalStateException("Unexpected SMAP line: " + line2);
                        }
                        int i = Integer.parseInt(matcher.group(1));
                        int i2 = Integer.parseInt(matcher.group(2).substring(1));
                        int i3 = Integer.parseInt(matcher.group(4));
                        if (!bitSet.get(i2) || i != i3) {
                            iMin = Math.min(i3, iMin);
                        }
                    }
                    return iMin;
                }
                bufferedReader.readLine();
                Matcher matcher2 = FILE_INFO_PATTERN.matcher(line);
                if (!matcher2.matches()) {
                    throw new IllegalStateException("Unexpected SMAP line: " + line);
                }
                if (matcher2.group(2).equals(str)) {
                    bitSet.set(Integer.parseInt(matcher2.group(1)));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            int i = 0;
            for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                if (15 == abstractInsnNode.getType()) {
                    i = ((LineNumberNode) abstractInsnNode).line;
                }
                if (i >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
                }
            }
        }
    }
}
