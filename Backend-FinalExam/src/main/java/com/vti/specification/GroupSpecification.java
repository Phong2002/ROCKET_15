package com.vti.specification;

import com.vti.entity.Group;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;

public class GroupSpecification implements Specification<Group> {

    private static final long serialVersionUID = 1L;

    private String key;
    private String operator;
    private Object value;

    public GroupSpecification(String key, String operator, Object value) {
        this.key = key;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public Predicate toPredicate(Root<Group> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        if (operator.equalsIgnoreCase("=")) {
            return builder.equal(root.<String>get(key), value.toString());
        }

        if (operator.equalsIgnoreCase(">")) {
            return builder.greaterThanOrEqualTo(root.<String>get(key), value.toString());
        }

        if (operator.equalsIgnoreCase("<")) {
            return builder.lessThanOrEqualTo(root.<String>get(key), value.toString());
        }

        if (operator.equalsIgnoreCase(">=")) {
            if (value instanceof Date) {
                return builder.greaterThanOrEqualTo(root.get(key), (Date) value);
            }
        }

        if (operator.equalsIgnoreCase("<=")) {
            if (value instanceof Date) {
                return builder.lessThanOrEqualTo(root.get(key), (Date) value);
            }
        }

        if (operator.equalsIgnoreCase("LIKE")) {
            return builder.like(root.<String>get(key), "%" + value.toString() + "%");
        }
        return null;
    }


}
