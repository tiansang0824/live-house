package com.tian.service.impl;

import com.tian.dao.ProposalDao;
import com.tian.domain.Proposal;
import com.tian.service.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProposalServiceImpl implements ProposalService {

    @Autowired
    private ProposalDao proposalDao;

    @Override
    public Proposal selectProposalById(int proposalId) {
        return proposalDao.selectProposalById(proposalId);
    }

    @Override
    public int addProposal(Proposal proposal) {
        return proposalDao.addProposal(proposal);
    }

    @Override
    public void delProposalById(int proposalId) {
        proposalDao.delProposalById(proposalId);
    }

    @Override
    public void editProposal(Proposal proposal) {
        proposalDao.editProposal(proposal);
    }

    @Override
    public List<Proposal> selectAllProposal() {
        return proposalDao.selectAllProposal();
    }
}
