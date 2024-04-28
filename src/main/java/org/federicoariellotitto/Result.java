package org.federicoariellotitto;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Result {
    public int maximaDiferencia(List<Integer> a) {
        int maxDiff = a.get(1) - a.get(0);
        int i, j;
        for (i = 0; i < a.size(); i++ ) {
            for (j = i + 1; j < a.size(); j++) {
                if (a.get(j) - a.get(i) > maxDiff) {
                    maxDiff = a.get(j) - a.get(i);
                }
            }
        }
        return maxDiff < 0 ? -1: maxDiff;
    }

    public List<String> balancedBraces(List<String> braces) {
        return braces.stream().map(b -> {
            String openPart = b.substring(0, b.length() / 2);
            Deque<String> openBraces = new ArrayDeque<>(List.of(b.split("")));
            boolean isBalanced = false;

            for (int i = 0; i < openPart.length(); i++) {
                String openBrace = openBraces.removeFirst();
                String closeBrace = openBraces.removeLast();
                isBalanced = switch (openBrace) {
                    case "(" -> closeBrace.equals(")");
                    case "[" -> closeBrace.equals("]");
                    case "{" -> closeBrace.equals("}");
                    default -> false;
                };
            }
            return isBalanced;
        }).map(isBalanced -> isBalanced ? "YES" : "NO").collect(Collectors.toList());
    }
}
