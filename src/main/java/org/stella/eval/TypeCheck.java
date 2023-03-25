package org.stella.eval;

import org.syntax.stella.Absyn.*;
import org.syntax.stella.VisitSkel;

import java.util.HashMap;
import java.util.Map;

public class TypeCheck
{
    public static void typeCheckProgram(Program program) throws Exception
    {
        VisitSkel.ProgramVisitor<Program, Map> programVisitor = new VisitSkel().getProgramVisitor();

        if (program instanceof AProgram) {
            HashMap<String, Class> types = new HashMap<>();
            programVisitor.visit((AProgram) program, types);
        } else{
            throw new RuntimeException("Invalid type of program");
        }
    }
}
