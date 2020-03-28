package test.controller.processors;

import test.model.ProcessorResult;

import javax.servlet.http.HttpServletRequest;

import static test.dao.StudentsList.getList;

public class ProcessorShowAllStudents extends Processor {
    public ProcessorShowAllStudents() {
        action = "showAllStudents";
    }

    @Override
    public ProcessorResult getResult(HttpServletRequest request) {
        request.getSession().setAttribute("studentsList", getList());

       return new ProcessorResult("/main", "/pages/showAllStudents.jsp", true);
    }
}
