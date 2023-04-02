package com.tian.service;

import com.tian.domain.Proposal;

import java.util.List;

public interface ProposalService {

    Proposal selectProposalById(int proposalId);

    int addProposal(Proposal proposal);

    void delProposalById(int proposalId);

    void editProposal(Proposal proposal);

    List<Proposal> selectAllProposal();
}
