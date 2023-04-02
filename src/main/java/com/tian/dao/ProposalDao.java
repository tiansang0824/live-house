package com.tian.dao;

import com.tian.domain.Proposal;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

// 对Proposal表的dao接口。
@Component
public interface ProposalDao {
    /**
     * 通过ProposalId查询Proposal信息。
     *
     * @param proposalId 需要使用的proposalid。
     * @return 返回一个Proposal对象，封装了相关的信息。
     */
    @Select("select * from proposals where cid = #{proposalid}")
    Proposal selectProposalById(@Param("proposalid") int proposalId);

    /**
     * 插入一个新的
     *
     * @param proposal proposal 对象，用于封装proposal信息。注意：因为mysql语句问题，这个proposal的id会被无效掉。
     */
    @Insert("INSERT INTO proposals (proposerName, proposerJob, idNum, phoneNum, email, sort, problem, title, content, isPublic)" +
            "VALUES ('#{proposerName}', '#{proposerJob}', '#{idNum}', '#{phoneNum}', '#{email}', '#{sort}', '#{problem}', '#{title}', '#{content}', #{isPublic});")
    @Options(useGeneratedKeys = true, keyProperty = "proposerName")
    int addProposal(Proposal proposal);

    /**
     * 通过 proposalId 删除 proposal。
     *
     * @param proposalId proposalid。
     */
    @Delete("DELETE FROM proposals WHERE pid = #{proposalid}")
    void delProposalById(@Param("proposalid") int proposalId);

    @Update("update proposals set proposerName=#{proposerName}, proposerJob=#{proposerJob}, idNum=#{idNum}, phoneNum=#{phoneNum}, email=#{email}, sort=#{sort}, problem=#{problem}, title=#{title}, content=#{content}, isPubli#{isPublic}")
    void editProposal(Proposal proposal);

    @Select("select * from proposals")
    List<Proposal> selectAllProposal();

}
