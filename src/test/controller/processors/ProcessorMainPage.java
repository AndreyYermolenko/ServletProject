package test.controller.processors;

import test.model.ProcessorResult;
import test.model.Student;

import javax.servlet.http.HttpServletRequest;

import static test.dao.StudentsList.addStudent;

public class ProcessorMainPage extends Processor {
    public ProcessorMainPage() {
        action = "mainPage";
    }

    @Override
    public ProcessorResult getResult(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        request.getSession().setAttribute("userName", userName);
        addStudent(new Student(userName));

        return new ProcessorResult("/main", "", true);
    }
}
